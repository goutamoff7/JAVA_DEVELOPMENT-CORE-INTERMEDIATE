// Enums are inbuilt type safe
public enum GenericEnumOp {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double opertion(T a, T b) {
        return switch (this) {
            case ADD -> a.doubleValue() + b.doubleValue();
            case SUBTRACT -> a.doubleValue() - b.doubleValue();
            case MULTIPLY -> a.doubleValue() * b.doubleValue();
            case DIVIDE -> a.doubleValue() / b.doubleValue();
        };
    }

    public static void main(String[] args) {
        System.out.println(GenericEnumOp.ADD.opertion(60,6));
        System.out.println(GenericEnumOp.SUBTRACT.opertion(60,6));
        System.out.println(GenericEnumOp.MULTIPLY.opertion(60,6));
        System.out.println(GenericEnumOp.DIVIDE.opertion(60,6));

    }
}

