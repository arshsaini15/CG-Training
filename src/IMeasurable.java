public interface IMeasurable<U> {
    double toBase(double value);
    double fromBase(double baseValue);
}