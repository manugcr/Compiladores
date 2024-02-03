import matplotlib.pyplot as plt

def read_symbol_table(file_path):
    symbol_tables = []
    with open(file_path, 'r') as file:
        current_table = []
        for line in file:
            line = line.strip()
            if line.startswith('NAME'):
                if current_table:
                    symbol_tables.append(current_table)
                    current_table = []
            elif line and not line.startswith('-'):
                current_table.append(line.split())
        if current_table:
            symbol_tables.append(current_table)
    return symbol_tables

def create_table_subplot(ax, data, title):
    ax.axis('off')
    ax.table(cellText=data, colLabels=data[0], cellLoc='center', loc='center')
    ax.set_title(title, fontsize=10)

def main():
    file_path = './proyectobase/symbolTable.log'
    symbol_tables = read_symbol_table(file_path)
    
    num_tables = len(symbol_tables)
    fig, axes = plt.subplots(num_tables, 1, figsize=(8, 5 * num_tables))
    
    # Flatten axes if there's only one row
    if num_tables == 1:
        axes = [axes]
    
    for i, (table, ax) in enumerate(zip(symbol_tables, axes)):
        title = f"Symbol Table {i+1}"
        create_table_subplot(ax, table, title)
    
    plt.tight_layout()
    plt.savefig('symbol_tables.png', bbox_inches='tight')
    print(f'Symbol tables saved as symbol_tables.png')

if __name__ == "__main__":
    main()

