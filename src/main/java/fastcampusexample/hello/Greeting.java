package fastcampusexample.hello;

public class Greeting {
    //멤버변수
    private final long id ; //의미? private: 다른 클래스 접근 불가, final : 상수정의 , 초기값 설정 필요. -> 생성자에서 매개변수로 받으면 상관없음.
    private final String content;

    //생성자
    //멤버변수중에 final 즉 상수변수가 있기 때문에 처음값이 설정이 안되어있다면 생성자에서 매개변수로 받아서 설정해줘야 함
    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }

    //private 변수는 외부에서 호출을 할 수 없기 때문에 get메서드를 만들어서 호출해준다
    public long getId(){
        return id;
    }

    //getId() 와 마찬가지로 content멤버변수가 private니까 content를 반환해주는 메서드를 만들어줌.
    public String getContent(){
        return content;
    }

}
