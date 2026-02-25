package lambdaTask1;

@FunctionalInterface
public interface Modify {
    public String replace(String str, char c, int index);
}