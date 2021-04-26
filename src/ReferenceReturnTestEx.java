class ReferenceReturnTestEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
// 반환타입이 참조형이라는것은 메서드가 객체의 주소를 반환한다는것을 의미한다.