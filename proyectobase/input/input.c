int addition(int a, int b);

int main() {
    int var1 = 3;
    int var2;

    var2 = 4*5;

    int result = addition(var1, var2);
    result++;
    

    return 0;    
}

int addition(int a, int b) {
    return a + b;
}