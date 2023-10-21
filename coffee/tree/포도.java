package coffee.tree;

public class 포도 {
    public static void main(String[] args){
        // TV 클래스 설계하기
        TVa n = new TVa();
        n.power();
        n.model_name("layla.networks");
        n.upchannel();

        n.getTvinfo();
    }
}
class TVa{
    // 개체(오브젝트) 생성의 설계도
    int channel = 0;
    boolean power;
    String model;

    void power(){ power = !power;};
    void down_channel(){
        channel -= 1;
    }
    void upchannel(){
        channel += 1;
    }
    void model_name(String _model){
        model = _model;
    }
    void getTvinfo(){
        System.out.printf("%d모델에 대한 정보! : 채널 - %d, 전원 = %b", model, channel, power);
    }
}