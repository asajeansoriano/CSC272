public class P2 {
    //Generic Class Pair
    public static class Pair<T> {
        private T first;
        private T second;
        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }
        public T getFirst() { return first; }
        public T getSecond() { return second; }
        public void setFirst(T first) { this.first = first; }
        public void setSecond(T second) { this.second = second; }

    }
    public static void main (String[] args) {
        //test Pair class
        Pair<Integer> pair1 = new Pair<Integer>(1, 2);
        Pair<String> pair2 = new Pair<String>("hello", "world");
        Pair<Float> pair3 = new Pair<Float>(1.0f, 2.0f);
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());
        System.out.println(pair3.getFirst() + " " + pair3.getSecond());
        //test setFirst and setSecond
        pair1.setFirst(3);
        pair1.setSecond(4);
        pair2.setFirst("hi");
        pair2.setSecond("there");
        pair3.setFirst(3.0f);
        pair3.setSecond(4.0f);
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());
        System.out.println(pair3.getFirst() + " " + pair3.getSecond());
    }
}
