package week07;

class KeyValue<K, V> { // 클래스 이름은 KeyValue<k, v>
    private K key;
    private V value;
    public K getKey() {
        return this.key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return this.value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}

public class TwoGeneric {
    public static void main(String[] args) {
        // 아래 kv 객체 생성으로 인해 K는 String으로, V는 Integer로 확정
        KeyValue<String, Integer> kv = new KeyValue<String, Integer>(); 
        kv.setKey("노트북");
        kv.setValue(1000000);
        System.out.println(kv.getKey() + " :: " + kv.getValue());

        KeyValue<Integer, String> kv2 = new KeyValue<Integer, String>();
        // 출력 -> 404: Not Found(요청한 페이지를 찾을 수 없습니다.)
        kv2.setKey(404);
        kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.");
        System.out.println(kv2.getKey() + ": " + kv2.getValue());

        KeyValue<String, Void> kv3 = new KeyValue<>();
        kv3.setKey("키값만 사용");
        System.out.println(kv3.getKey());
    }
}
