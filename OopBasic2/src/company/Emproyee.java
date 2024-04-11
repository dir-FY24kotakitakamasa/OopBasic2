package company;

public class Emproyee {

    protected final String name;
    private final Department department;
    private final String position;
    private final int employeeId;
    //フィールド
    
               //コンストラクターの名前はクラスと一致させる！
    public Emproyee(String name, Department department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }
    //　↑　コンストラクター（インスタンスの初期化を行う）。コンストラクターは戻り値なしなので、void不要
    //this.はインスタンスを表す。コンストラクターの引数（茶色）との区別
    
    //オーバーロード：同じクラス内で同じ名前のメソッドやコンストラクターを複数定義すること
    public void report(int times) {
        System.out.println(times + "回目の報告をします。 役職：" + position + "、名前：" + name);
    }
    
    public void report() {
        report(1);
    }
    
    public void joinMeeting() {
        department.meeting();
        System.out.println("→上記の会議に出席します。部署：" + department.getName() + "名前：" + name);
    }
     
}
