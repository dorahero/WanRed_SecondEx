package Cola;

public class Drink {
    static int res = 0;
    public static void main(String[] args) {
        Cola cola = new Cola(20);
        Integer c = cola.cash;
        for(int i = 0; i <= c; i++) {
            for(int j = i; j <= c; j++){
                cola.cola200(i);
                cola.cola300(j);
                cola.cola500(c-j);
                cola.check();
                // 若喝的總容量更多
                if(res < cola.total){
                    res = cola.total;
                }
                System.out.println(cola.toString());
                cola.init(c);
            }
        }
        System.out.println(res);
    }
}
