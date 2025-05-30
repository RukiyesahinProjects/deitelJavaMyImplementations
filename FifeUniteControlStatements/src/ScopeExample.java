public class ScopeExample {
    // Class field (instance variable)
    int value = 100;

    // Method that shadows the class field with a local variable
    public void localShadowing() {
        int value = 50; // This shadows the class-level 'value'
        System.out.println("Inside localShadowing, local value = " + value);
        System.out.println("Inside localShadowing, class value = " + this.value);
        this.value=150;
        value=151;
    }

    // Method that takes a parameter named 'value', which also shadows the field
    public void parameterShadowing(int value) {
        System.out.println("Inside parameterShadowing, parameter value = " + value);
        System.out.println("Inside parameterShadowing, class value = " + this.value);
        this.value = value; // Assign parameter value to the class field
        System.out.println("After assignment, class value = " + this.value);
    }

    // Method to print current field value
    public void printValue() {

        System.out.println("Current class value = " + this.value);
    }

    // Main method to test everything
    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();

        System.out.println("Initial field value:");
        example.printValue();

        System.out.println("\nCalling localShadowing...");
        example.localShadowing();
        example.printValue();  // Field remains unchanged
        System.out.println("localshdow 2. kez");
        example.localShadowing();

        System.out.println("\nCalling parameterShadowing with 200...");
        example.parameterShadowing(200);
        example.printValue();  // Field is now updated to 200
    }
}

