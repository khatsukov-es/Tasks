import java.util.List;

public class Task5 {

    public static void main(String[] args) {

    }

    public void checkCollections(List<ObjectA> list1, List<ObjectA> list2) throws Exception {
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                throw new Exception("Обьекты под индексом " + i + " не равны");
            }
        }
    }


    public class ObjectA {
        int id;
        String name;
        String value;

        @Override
        public boolean equals(Object obj) {
            ObjectA objectA = (ObjectA) obj;
            if (this.id == objectA.id && this.name.equals(objectA.name) && this.value.equals(objectA.value)) {
                return true;
            } else return false;
        }
    }
}
