public class Parts {
    public Part[] arr;

    Parts(String[] namesArr){
        this.arr = new Part[namesArr.length];
        for (int i = 0; i < namesArr.length; i++){
            this.arr[i] = new Part(namesArr[i]);
        }
    }

    public synchronized boolean putPart(String name){
        for (Part part : this.arr) {
            if (part.getName().equals(name)) {
                if (part.getAmount() < part.getLimit()) {
                    part.amount++;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public synchronized boolean getPart(String name){
        for (Part part : this.arr) {
            if (part.getName().equals(name)) {
                if (part.getAmount() > 0) {
                    part.amount--;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Part part : this.arr) {
            s.append(part.getName()).append("\t");
        }
        s.append("\n");
        for (Part part : this.arr) {
            s.append(part.getAmount()).append("\t");
        }
        return s.toString();
    }

    public static class Part {
        public final String name;
        public int amount = 0;
        public int limit = 5;

        Part(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }

        public int getLimit() {
            return limit;
        }
    }

}
