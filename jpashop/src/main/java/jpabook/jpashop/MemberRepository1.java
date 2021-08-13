//package jpabook.jpashop;
//
//import jpabook.jpashop.domain.Member;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//@Repository
//public class MemberRepository1 {
//
//    @PersistenceContext
//    private EntityManager em;
//
//    public Long save(Member member) {
//        em.persist(member);     //persist: 엔티티를 영속화 한다는 뜻 db저장은 그 이후
//        return member.getId();
//    }
//
//    public Member find(Long id) {
//        return em.find(Member.class, id);
//    }
//}

