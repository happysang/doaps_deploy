package kgu.doaps;

import kgu.doaps.domain.Address;
import kgu.doaps.domain.GenderStatus;
import kgu.doaps.domain.Member;
import kgu.doaps.domain.MemberStatus;
import kgu.doaps.domain.item.Item;
import kgu.doaps.domain.item.Pepper;
import kgu.doaps.service.ItemService;
import kgu.doaps.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.YearMonth;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final MemberService memberService;
    private final ItemService itemService;

    @PostConstruct
    public void init(){
        Member member1 = new Member();
        member1.setLoginId("happysang"); //아이디
        member1.setPassword("happysang"); //비밀번호
        member1.setName("권혁상"); //이름
        member1.setPhone("01012345678"); //전화번호
        member1.setAge("26"); //나이
        member1.setGenderStatus(GenderStatus.MALE); //성별 GenderStatus.MALE 또는 GenderStatus.FEMALE 둘 중 하나
        member1.setMemberStatus(MemberStatus.SELLER); //고정
        member1.setAddress(new Address("서울시", "송파구", "방이동")); //주소
        memberService.join(member1);

        Member member100 = new Member();
        member100.setLoginId("seok");
        member100.setPassword("1234");
        member100.setName("이석근");
        member100.setPhone("01054531023");
        member100.setGenderStatus(GenderStatus.MALE);
        member100.setMemberStatus(MemberStatus.SELLER);
        member100.setAddress(new Address("수원시", "영통구 이의동", "110"));
        member100.setAge("25");
        memberService.join(member100);

        Member member200 = new Member();
        member200.setLoginId("twosomepepper"); //아이디
        member200.setPassword("user"); //비밀번호
        member200.setName("권도훈"); //이름
        member200.setPhone("01078965457"); //전화번호
        member200.setAge("24"); //나이
        member200.setGenderStatus(GenderStatus.MALE); //성별 GenderStatus.MALE 또는 GenderStatus.FEMALE 둘 중 하나
        member200.setMemberStatus(MemberStatus.SELLER); //고정
        member200.setAddress(new Address("경기도 수원시", "영통구", "영통동")); //주소
        memberService.join(member200);



        Pepper pepper200 = new Pepper();
        pepper200.setMember(member200);  // 판매자 계정으로 member 입력
        pepper200.setImgUrl("/images/pepper200.png"); //사진이름(upload/사진이름.jpg또는png)
        pepper200.setName("미인 보라 (가지)고추"); //고추 이름
        pepper200.setPrice(17000); //가격 입력
        pepper200.setStockQuantity(100); //재고 입력
        pepper200.setExplain("가지와 고추를 합친 미인 보라 고추를 만나보세요. 오이고추처럼 과피가 두꺼운 편이라 아삭한 식감이 살아있는 고추입니다. 매운맛이 거의 없고 가지 특유의 달큰함과 시원한 맛이 가득해, 누구나 부담없이 먹기 좋습니다.");
        pepper200.setProcessing("생고추"); //가공상태 작성 (건조, 씨, 생고추)
        pepper200.setVariety("오이고추"); //품종 (청양, 오이 등)
        pepper200.setOrigin("국내산"); //국내산 중국산 미국산 기타 중에서 하나 작성
        pepper200.setOriginD("국내산"); // 국내산 중국산 미국산 일때는 동일하게, 기타일 때만 그 때 품종 작성
        pepper200.setImportDate(YearMonth.of(2021,10)); //가공일
        pepper200.setProcessDate(YearMonth.of(2021,11)); //수입일
        pepper200.setSpicy(25); //맵기 정도
        pepper200.setColor("#660099"); //고추 색
        itemService.saveItem(pepper200);


        Pepper pepper201 = new Pepper();
        pepper201.setMember(member200);  // 판매자 계정으로 member 입력
        pepper201.setImgUrl("/images/pepper201.jpg"); //사진이름(upload/사진이름.jpg또는png)
        pepper201.setName("매운맛 불고추"); //고추 이름
        pepper201.setPrice(29800); //가격 입력
        pepper201.setStockQuantity(500); //재고 입력
        pepper201.setExplain("요리에 아찔한 매운맛을 더해주는 베트남 건고추입니다. 페페론치노보다 크고, 청양고추보다 비교적 작은 편입니다. 오늘의 메뉴에 깔끔하고 화끈한 매운 맛을 더하고 싶다면, 매운맛 불고추를 활용해 보세요.");
        pepper201.setProcessing("건고추"); //가공상태 작성
        pepper201.setVariety("청양"); //품종
        pepper201.setOrigin("기타"); //국내산 중국산 미국산 기타 중에서 하나 작성
        pepper201.setOriginD("베트남"); // 국내산 중국산 미국산 일때는 동일하게, 기타일 때만 그 때 품종 작성
        pepper201.setImportDate(YearMonth.of(2021,5)); //가공일
        pepper201.setProcessDate(YearMonth.of(2021,7)); //수입일
        pepper201.setSpicy(10000); //맵기 정도
        pepper201.setColor("#CD1039"); //고추 색
        itemService.saveItem(pepper201);


        Pepper pepper102 = new Pepper();
        pepper102.setName("아삭이고추");
        pepper102.setPrice(12000);
        pepper102.setMember(member100);
        pepper102.setStockQuantity(500);
        pepper102.setImgUrl("/images/pepper102.PNG");
        pepper102.setSales(0);
        pepper102.setExplain("아삭이 고추는 오이만큼 크기도 크지만 아삭아삭한 식감이 좋습니다. 풋고추와 피망의 교잡을 통해 만든 크면서 안 매운 고추입니다.");
        pepper102.setProcessing("생고추");
        pepper102.setImportDate(YearMonth.of(2021,6));
        pepper102.setProcessDate(YearMonth.of(2021,8));
        pepper102.setOrigin("미국산");
        pepper102.setOriginD("미국산");
        pepper102.setVariety("아삭이고추");
        pepper102.setColor("#1DDB16");
        pepper102.setSpicy(200);
        itemService.saveItem(pepper102);


        Pepper pepper100 = new Pepper();
        pepper100.setName("베트남 하늘초");
        pepper100.setPrice(40000);
        pepper100.setMember(member100);
        pepper100.setStockQuantity(1500);
        pepper100.setImgUrl("/images/pepper100.PNG");
        pepper100.setSales(0);
        pepper100.setExplain("가지과로 고추크기는 약 3Cm정도로 아주 작으며 매운 편입니다.");
        pepper100.setProcessing("건조");
        pepper100.setImportDate(YearMonth.of(2021,6));
        pepper100.setProcessDate(YearMonth.of(2021,8));
        pepper100.setOrigin("기타");
        pepper100.setOriginD("베트남");
        pepper100.setVariety("하늘초");
        pepper100.setColor("#A50000");
        pepper100.setSpicy(9500);
        itemService.saveItem(pepper100);

        Pepper pepper101 = new Pepper();
        pepper101.setName("중국산 화건초");
        pepper101.setPrice(16000);
        pepper101.setMember(member100);
        pepper101.setStockQuantity(2000);
        pepper101.setImgUrl("/images/pepper101.PNG");
        pepper101.setSales(0);
        pepper101.setExplain("고추기름 등에도 쓰이는 중국산 통고추입니다. 말린 후 가공되었습니다.");
        pepper101.setProcessing("건조");
        pepper101.setImportDate(YearMonth.of(2021,5));
        pepper101.setProcessDate(YearMonth.of(2021,7));
        pepper101.setOrigin("중국산");
        pepper101.setOriginD("중국산");
        pepper101.setVariety("화건초");
        pepper101.setColor("#DB0000");
        pepper101.setSpicy(9500);
        itemService.saveItem(pepper101);


        Pepper pepper1 = new Pepper();
        pepper1.setMember(member1);  // 판매자 계정으로 member 입력
        pepper1.setImgUrl("/images/pepper1.jpg"); //사진이름
        pepper1.setName("땡초"); //고추 이름
        pepper1.setPrice(7300); //가격 입력
        pepper1.setStockQuantity(1000); //재고 입력
        pepper1.setExplain("베트남에서 건너온 싱싱하고 맛 좋은 고추입니다. 매운 편이며 80kg거래부터 가능합니다. 칼타이탄 고추는 신미가 강하고 건과품질이 우수합니다. 논토양, 평탄지 등 생육기간 동안 적절한 토양 수분관리가 가능한 지역에서 재배하였습니다."); //설명 부분
        pepper1.setProcessing("건조"); //가공상태 작성
        pepper1.setVariety("칼타이탄"); //품종
        pepper1.setOrigin("기타"); //국내산 중국산 미국산 기타 중에서 하나 작성
        pepper1.setOriginD("베트남"); // 국내산 중국산 미국산 일때는 동일하게, 기타일 때만 그 때 품종 작성
        pepper1.setProcessDate(YearMonth.of(2021,9)); //수입일
        pepper1.setImportDate(YearMonth.of(2021,11)); //가공일
        pepper1.setSpicy(4400); //맵기 정도
        pepper1.setColor("#e11414"); //고추 색
        itemService.saveItem(pepper1);
    }
}
