package hrjava.advanced;

class JavaSingleton {
    private static JavaSingleton s = new JavaSingleton();
    public String str;

    private JavaSingleton() {

    }

    public static JavaSingleton getSingleInstance() {
        return s;
    }
}
