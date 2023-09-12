package Q230828.P3;

public interface Action {
    // 실제 동작 없이, 선언만 모여있음, 사용이 필요할 때 implements 키워드로 호출한다.
    /**
     * 액션의 결과를 확인한다.
     * test용 함수
     * */

    public void print();

    /**
     * 액션 결과의 값을 반환한다.
     * @return power : 액션 값
     * */
    public int actionPower();
    public double calculation();
    public void power();
}
