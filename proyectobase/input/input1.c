int average(int a, int b, int c);

int main() {
    int var1 = 1;
    int var2 = 2;
    int var3 = 3;

    int avg = average(var1, var2, var3);

    return 0;    
}

int average(int a, int b, int c) {
    return (a + b + c) / 3;
}
