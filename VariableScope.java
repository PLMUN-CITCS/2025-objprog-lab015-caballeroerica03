public class VariableScope {
    // Global variable (accessible to all methods in the class)
    static int globalCount = 100;

    // Main method
    public static void main(String[] args) {
        // Print globalCount from main
        System.out.println("Global Count (from main): " + globalCount);

        // Call the showScope method
        showScope();
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        // Local variable (only accessible inside this method)
        int localCount = 50;

        // Print global and local variables
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
