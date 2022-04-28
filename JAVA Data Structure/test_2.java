package exam;

import java.util.Scanner;

/**
 * 2022, 04. 18 (월)
 * 방아현
 */
public class test {

    public static void main(String[] args) {

        ListStack<Object> listStack = new ListStack<>(); //Object 자리에 int나 String을 넣을거면 지정해서 int나 String을 써도 된다.
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("1에서 5사이의 값을 입력해주세요.");
        System.out.println("1: insert, 2: delete, 3: output, 4: invert, 5:exit");
        while (!(input = scanner.nextLine()).equals("5")) {
            switch (input) {
                case "1" -> listStack.add(scanner.nextLine());
                case "2" -> listStack.delete();
                case "3" -> listStack.print();
                case "4" -> listStack.invert();
                default -> System.out.println("옳지 않은 번호입니다.");
            }
            System.out.println("1에서 5사이의 값을 입력해주세요.");
            System.out.println("1: insert, 2: delete, 3: output, 4: invert, 5:exit");
        }
    }
}

class ListStack <T> {

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    // Node 내부 클래스 생성
    private class Node <T> { //String인지 int인지 뭐가 들어올지 모르므로 T 제네릭을 넣는다.
        private T item;  // 아이템 값 (T 제너릭 형식)
        private Node next;  // 내꺼 다음 노드

        public Node(T item) {
            this.item = item;
            this.next = null;  // 아직 넣을 값이 없기 떄문에 null
        }
    }

    //맨 첫 노드 = head
    private Node<T> head;

    // head 주소를 모르므로 null로 해준다.
    public ListStack() {
        this.head = null;
    }

    // add 메소드
    public void add(T t) { // 이때부터 head가 주소값을 가지기 시작한다.
        Node<T> node = new Node<>(t);  // node가 만들어진다.
        if (this.head != null) {  // head가 null이 아닐 경우에는 내가 뭔가를 가리키고 있는 것이므로.
        // next노트가 없으면, head가 null이다.
            node.next = this.head;  // 노드의 next값은 head가 가리키는 것이므로 node.next가 head가 된다.
        }
        this.head = node;  // head 가리키는게 없으므로 head가 node가 된다.
    }

    // delete 메소드
    public void delete() {
        Node<T> node = this.head;  //this.head는 현재 내가 가리키는 애다. 이 애를 node에 넣는다. 
        if (node == null) { // 아무것도 없으면
            System.out.println("삭제할 대상이 없습니다.");
        } else {  //값이 있을 경우
            this.head = node.next;  // head가 next 건너뛰고 node의 next가 되므로.
            node.item = null;
            node.next = null;
            System.out.println("삭제되었습니다.");
        }
    }

    // print 메소드
    public void print() {
        Node<T> node = this.head;
        if (node != null) { //node가 null이 아닌 경우
            while (node.next != null) {  // 마지막께 null이 아닐때 계속 반복
                System.out.print(ANSI_YELLOW + node.item + " -> " + ANSI_RESET); // 마지막 이전 노드까지 print한다.
                node = node.next;
            }
            System.out.println(ANSI_YELLOW + node.item + ANSI_RESET); // 마지막 노드를 출력한다.
        } else {  // 비어있으면
            System.out.println("ListStack이 비어있습니다.");
        }
    }

    // invert 메소드
    public ListStack invert() {  // head랑 마지막 노드 null 순서 역순. 
        Node<T> now = this.head;
        Node<T> prev = null; // 첫 시작을 null로 설정 -> 어차피 역순하면 null일 것이므로 
        if (now != null) {  // 내 자신이 null 아닐 때까지 즉, 첫번쨰 null까지 역순 쭉 가기 
            while (now != null) {
                Node<T> tmp = now.next; 
                now.next = prev;  // now랑 prev랑 앞 뒤 바꿔줌
                prev = now; // 앞으로 한 칸 씩 간다.
                now = tmp;  // 앞으로 한 칸 씩 간다.
            }
            // now, tmp, prev 3개를 써서 한다. 
            this.head = prev; 
            System.out.println("invert하였습니다.");
            return this;
        } else {
            System.out.println("ListStack이 비어있습니다.");
            return null;
        }
    }
}
