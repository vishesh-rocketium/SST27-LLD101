// Separate interfaces following ISP
interface Printer {
    void print(String text);
}

interface Scanner {
    void scan(String dstPath);
}

interface FaxMachine {
    void fax(String number);
}

// Combined interface for machines that support all operations
interface MultiFunctionMachine extends Printer, Scanner, FaxMachine {
}
