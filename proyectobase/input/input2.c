int sum_of_n(int n);

int main() {
    int n = 10;

    int sum = sum_of_n(n);
    
    sum--;

    return 0;    
}

int sum_of_n(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum = sum + i;
    }
    return sum;
}
