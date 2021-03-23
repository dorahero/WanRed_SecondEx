### Solution: 
- set class cola methods  
```java
package Cola;

public class Cola {
    int cash; 
    private int bottle;
    private int cap;
    int total;  
    private int canused;
    public Cola(int cash) {
        this.cash = cash;
    }
    // 設定喝可樂的 method
    public void cola500(int nums){
        if(this.cash < nums*3){
            System.out.println("You are poor.");
        } else {
            this.total += nums*500;
            this.canused += nums*500;
            this.bottle += nums*1;
            this.cap += nums*1;
            this.cash -= nums*3;
        }
    }

    public void cola300(int nums){
        if(this.cash < nums*2){
            System.out.println("You are poor.");
        } else {
            this.total += nums*300;
            this.canused += nums*300;
            this.bottle += nums*1;
            this.cap += nums*1;
            this.cash -= nums*2;
        }
    }

    public void cola200(int nums){
        if(this.cash < nums*1){
            System.out.println("You are poor.");
        } else {
            this.total += nums*200;
            this.canused += nums*200;
            this.bottle += nums*1;
            this.cap += nums*1;
            this.cash -= nums*1;
        }
    }
    // 設定活動 method
    public void total1000(){
        this.total += 300;
        this.canused -= 700;
        this.bottle += 1;
        this.cap += 1;
    }
    
    public void bottle3(){
        this.total += 300;
        this.canused += 300;
        this.bottle -= 2;
        this.cap -= 2;
    }

    public void cap3(){
        this.total += 200;
        this.canused += 200;
        this.bottle -= 2;
        this.cap -= 2;
    }
    // 確認是否可兌換活動
    public void check(){
        while(this.bottle >= 3 || this.cap >= 3 || this.canused >= 1000){
            if(this.bottle >= 3){
                bottle3();
            }
            if(this.cap >= 3){
                cap3();
            }
            if(this.canused >= 1000){
                total1000();
            }
        }
    }

    public void init(int cash){
        this.cash = cash;
        this.total = 0;
        this.canused = 0;
        this.bottle = 0;
        this.cap = 0;

    }

    // override toString 方便觀察
    public String toString() {
        return "cash: "+ cash + ", bottle: " + bottle + ", cap: " + cap + ", total: " + total + ", canused: " + canused;
    }
}

```

- drink with cash  
```java
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
```