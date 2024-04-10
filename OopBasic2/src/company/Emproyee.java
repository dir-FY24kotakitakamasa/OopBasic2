package company;

public class Emproyee {

    String name;
    String department;
    String position;
    int employeeId;
    //フィールド
    
               //コンストラクターの名前はクラスと一致させる！
    public Emproyee(String name, String department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }
    //　↑　コンストラクター（インスタンスの初期化を行う）。コンストラクターは戻り値なしなので、void不要
    
    public void report(int times) {
        System.out.println(times + "回目の報告をします。 役職： " + position + "、名前 ： " + name);
    }
    
    public void report() {
        report(1);
    }
     
}
