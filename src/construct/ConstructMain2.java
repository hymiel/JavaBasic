package construct;

public class ConstructMain2 {
    public static void main(String[] args) {


    MemberConstruct member1 = new MemberConstruct("user1",15,80);
    MemberConstruct member2 = new MemberConstruct("user2" , 14);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct  s : members) {
        System.out.println(s.name+s.age+s.grade);
    }
}
}
