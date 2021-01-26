package kr.co.ilg.activity.mypage;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.capstone.R;

public class ServiceInfoActivity extends Activity implements View.OnClickListener {

    TextView text1;
    Button btn1, btn2, btn3,btn4;
    Button[] btns = {btn1, btn2, btn3,btn4};
    int[] btnsid = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4};
    String ToS1 = "제 1 조 [목적]\n본 약관은 (주)휘뚜루마뚜루(이하 “회사”)가 운영하는 인력거(이하 “사이트”)를 통하여 직업정보 관련 제반 “서비스”를 제공함에 있어 이용 고객(이하 “회원”)과 “회사”간의 권리, 의무 및 책임사항, 기타 필요한 사항을 규정함을 목적으로 합니다.\n\n" +
            "제 2 조 [약관의 효력과 변경]\n① 본 약관은 회원에게 공시함으로써 효력이 발생됩니다.\n" +
            "② “회사”는 관련 법규를 준수하는 범위 내에서 본 약관을 개정할 수 있으며, 사정상 중요한 사유가 발생하여 사전 통지가 불가피 할 경우 약관의 내용을 사전 통지 없이 변경한 후 “회원”에게 변경된 사실에 대하여 통지하여야 합니다.\n" +
            "③ “회사”가 약관을 개정할 경우에는 개정 사유와 적용일자를 명시하고 현행 약관과 함께 본 조 제 ①항의 방식에 따라 개정 약관의 적용 일 최소 7일 이전부터 적용 일 전일까지 공지 또는 통지함으로써 효력이 발생됩니다. 다만, " +
            "“회원”에게 불리한 조건으로 개정될 경우 최소한 15일 이상의 사전 유예기간을 두고 공지 또는 통지하여야 하며, “회사”는 개정 전 내용과 개정 후 내용을 명확하게 비교하여 이용자가 이해하기 쉽도록 표시하여 “회원”에게 공지 또는 통지하여야 합니다.\n" +
            "④ “회원”이 약관 공지의 날로부터 지정된 유예기간 내에 개정될 약관에 대해 별도의 의사표시를 하지 않을 경우 “회사”는 “회원”이 개정된 약관의 내용에 대해 동의한 것으로 간주합니다.\n" +
            "⑤ “회원”은 “회사”가 개정한 약관의 내용에 동의하지 않을 경우 회원 탈퇴(이하 “가입 해지”)를 요청할 수 있습니다.\n" +
            "⑥ “회사”는 “서비스” 운영에 따라 “사이트” 별 특별 조항을 생성하거나 기존 약관을 개정할 수 있으며, 이 경우 해당 “사이트”를 통하여 본 조 제 ①항의 방식에 따라 “회원”에게 공지 또는 통보 후 약관을 적용할 수 있습니다.\n" +
            "⑦ “회사”는 본 약관의 내용과 상호, 영업장 소재지, 대표자의 성명, 사업자등록번호, 연락처 등을 이용자가 알 수 있도록 게시하거나 기타의 방법으로 이용자에게 공지하여 “회원”이 원할 경우 언제든 본 약관을 확인할 수 있도록 장치를 마련하여야 합니다.\n\n" +
            "제 3 조 [약관 외 준칙]\n본 약관에서 규정하지 않은 사항에 관해서는 전기통신기본법, 전기통신사업법, 정보통신망 이용촉진 및 정보보호 등에 관한 법률, 전자거래기본법, 신용정보이용 및 보호에 관한 법률, 기타 관련 법령의 규정에 따릅니다.\n\n" +
            "제 4 조 [용어의 정의]\n본 약관에서 사용하는 용어의 정의는 아래와 같습니다.\n" +
            "① “사이트”라 함은 “회사”가 “회원”에게 “서비스”를 제공하기 위하여 컴퓨터 및 휴대폰 단말기 등의 정보통신설비를 이용하여 설정한 가상의 영업장 또는 “회사”가 운영하는 웹사이트를 말하며, 통합된 하나의 “회원 아이디(ID)” 및 “비밀번호”를 이용하여 “서비스”를 제공받을 수 있는 아래의 “사이트”를 말합니다.\n" +
            "- 인력거 = http://14.63.218.69/phpmyadmin/\n" +
            "② “서비스”라 함은 “회사”가 운영하는 “사이트”를 통해 “회원”이 등록하는 자료 등을 각각의 목적에 맞게 분류 가공, 집계하여 정보를 제공하는 서비스와 기타 관련된 모든 부대 서비스를 말합니다.\n" +
            "③ “개인 회원”이라 함은 “회사”가 운영하는 “사이트”를 통하여 본 약관에 동의하고, “회사” 와 이용 계약을 체결하여 “아이디(ID)”를 부여 받은 개인을 말합니다.\n" +
            "④ “기업 회원”이라 함은 인력 채용 및 교육을 목적으로 “회사”가 운영하는 “사이트”를 통하여 본 약관에 동의하고, “회사”와 이용 계약을 체결하여 “아이디(ID)”를 부여 받은 기업과 단체를 말합니다.\n" +
            "⑤ “아이디(ID)”라 함은 “회원” 식별과 “회원”의 “서비스” 이용을 위하여 “회원”이 직접 지정하고 이를 “회사”가 부여하는 문자 또는 숫자의 조합을 말합니다.\n" +
            "⑥ “비밀번호”라 함은 “서비스”를 이용하려는 사람이 “아이디(ID)”를 부여 받은 자와 동일인임을 확인하고, “회원”의 권익을 보호하기 위하여 “회원”이 직접 지정한 문자 또는 숫자의 조합을 말합니다.\n\n";
    String ToS2 = "제1조 (목적)\n" +
            "이 약관은 농협생명보험주식회사(이하 “회사”라 한다)와 이용자 사이의 전자금융거래에 관한 기본적인 사항을 정함으로써 거래를 신속하고 효율적으로 처리하며 거래당사자 상호간의 이해관계를 합리적으로 조정하는 것을 목적으로 한다.\n" +
            "제2조(용어의 정의)\n" +
            "① 이 약관에서 사용하는 용어의 정의는 다음 각 호와 같다.\n" +
            "1. “전자금융거래”라 함은 회사가 전자적 장치를 통하여 금융상품 및 서비스를 제공하고 이용자가 회사와 직접 대면하거나\n" +
            "의사소통을 하지 아니하고 자동화된 방식으로 이를 이용하는 거래를 말한다.\n" +
            "2. “이용자”라 함은 전자금융거래를 위하여 회사와 체결한 계약(이하 “전자금융거래계약” 이라 한다)에 따라 전자금융거래를\n" +
            "이용하는 자를 말한다.\n" +
            "3. “전자적 장치”라 함은 전자금융거래정보를 전자적 방법으로 전송하거나 처리하는데 이용되는 장치로서 현금자동지급기,\n" +
            "자동입출금기, 지급용단말기, 컴퓨터, 전화기 그 밖에 전자적 방법으로 정보를 전송하거나 처리하는 장치를 말한다.\n" +
            "4. “접근매체”라 함은 전자금융거래에 있어서 이용자가 거래지시를 하거나 또는 이용자 및 거래내용의 진실성과 정확성을\n" +
            "확보하기 위하여 사용되는 다음 각목의 어느 하나에 해당하는 수단 또는 정보를 말한다.\n" +
            "가. 전자식 카드 및 이에 준하는 전자적 정보\n" +
            "나. 전자서명법에 따른 인증서\n" +
            "다. 회사에 등록된 이용자 번호\n" +
            "라. 등록되어 있는 이용자의 생체정보\n" +
            "마. 가목 또는 나목의 수단이나 정보를 사용하는데 필요한 비밀번호\n" +
            "5. “전자문서”라 함은 전자문서 및 전자거래기본법 제2조제1호의 규정에 따라 작성, 송신ㆍ수신 또는 저장된 정보를 말한다.\n" +
            "6. “거래지시”라 함은 이용자가 전자금융거래계약에 따라 회사에게 전자금융거래의 처리를 지시하는 것을 말한다.\n" +
            "7. “오류”라 함은 이용자의 고의 또는 과실 없이 전자금융거래가 약관(개별약관을 포함한다), 전자금융거래계약 또는 이용자의\n" +
            "거래지시에 따라 이행되지 아니한 경우를 말한다.\n" +
            "8. “전자지급거래”라 함은 자금을 주는 자(이하 “지급인”이라 한다)가 회사로 하여금 전자지급수단을 이용하여\n" +
            "자금을 받는 자(이하 “수취인”이라 한다)에게 자금을 이동하게 하는 전자금융거래를 말한다.\n" +
            "9. “전자지급수단”이라 함은 전자자금이체, 직불전자지급수단, 선불전자지급수단, 전자화폐, 신용카드, 전자채권 그 밖의\n" +
            "전자적 방법에 따른 지급수단을 말한다.\n" +
            "10. “전자자금이체”라 함은 지급인과 수취인 사이에 자금을 지급할 목적으로 회사에 개설된 계좌에서 다른 계좌로 전자적 장치에 의하여 다음 각 목의 어느 하나에 해당하는 방법으로 자금을 이체하는 것을 말한다.\n" +
            "가. 회사에 대한 지급인의 지급지시\n" +
            "나. 회사에 대한 수취인의 추심지시(이하 “추심이체”라 한다)\n" +
            "11. “정보시스템”이라 함은 전자금융업무를 포함하여 정보기술부문에 사용되는 하드웨어(hardware)와 소프트웨어(software)를 말하며 관련 장비를 포함한다.\n" +
            "12. “영업일”이라 함은 회사가 영업점에서 정상적인 영업을 하는 날을 말한다.\n" +
            "13. “개별약관”이라 함은 이 약관과 함께 전자금융거래에 적용되는 약관으로서 회사가 별도로 작성한 약관을 말한다.\n" +
            "② 이 약관에서 별도로 정하지 아니한 용어의 정의는 전자금융거래법 및 전자금융 거래법 시행령, 전자금융감독규정 및\n" +
            "전자금융감독규정 시행세칙에서 정하는 바에 따른다.\n" +
            "제3조(적용범위)\n" +
            "이 약관은 다른 법률에 특별한 규정이 있는 경우를 제외하고 모든 전자금융거래에 적용한다.";
    String ToS3 = "1. 총 칙\n" +
            "개인정보란 생존하는 개인에 관한 정보로서 당해 정보에 포함되어 있는 성명，본인인증기관을 통해 인증된 개인식별 번호 등의 사항에 의하여 당해 개인을 식별할 수 있는 정보(당해 정보만으로는 특정 개인을 식별할 수 없더라도 다른 정보와 용이하게 결합하여 식별할 수 있는 것을 포함합니다)를 말합니다.\n" +
            "① (주)휘뚜루마뚜루는 정보주체의 개인정보보호를 매우 중요시하며, 『정보 통신망 이용 촉진 및 정보보호에 관한 법률』상의 개인정보 보호 규정 및 『개인정보보호법』을 준수하고 있습니다. (주)휘뚜루마뚜루는 개인정보 처리방침을 통하여 정보주체가 제공하는 개인정보가 어떠한 용도와 방식으로 이용되고 있으며 개인정보보호를 위해 어떠한 조치가 취해지고 있는지 알려드립니다.\n" +
            "② (주)휘뚜루마뚜루는 개인정보 처리방침을 홈페이지 첫 화면에 공개함으로써 이용자가 언제나 용이하게 볼 수 있도록 조치하고 있습니다.\n" +
            "③ (주)휘뚜루마뚜루는 개인정보 처리방침의 지속적인 개선을 위하여 개인정보 처리방침을 개정하는데 필요한 절차를 정하고 있습니다.\n\n" +
            "2. 개인정보 수집범위\n" +
            "(주)휘뚜루마뚜루는 별도의 회원가입 없이도 대부분의 컨텐츠에 자유롭게 접근할 수 있습니다. 하지만 보다 다양하고 양질의 서비스를 원하실 경우 아래의 내용을 입력하신 후 회원가입을 하시면 모든 서비스를 편리하게 이용하실 수 있습니다.\n" +
            "(주)휘뚜루마뚜루는 크게 기업회원과 개인회원으로 나뉘어 있습니다.\n" +
            "(주)휘뚜루마뚜루는 회원가입, 원활한 고객상담, 각종 서비스의 제공을 위해 최초 회원가입 시 홈페이지를 통해 아래와 같은 개인정보를 수집하고 있습니다.\n" +
            "기업회원의 경우는 서비스를 이용하는 담당자의 정보를 마찬가지로 요구합니다. 필수적으로 제공해 주셔야 할 정보와 선택적으로 제공해 주실 정보는 회원가입 시 공지하고 있으며, 선택 사항을 제공하지 않으시더라도 기본 서비스는 이용하실 수 있습니다.\n" +
            "① 개인회원 가입 시\n<인력거>\n- 필수 항목: ID(이메일), 비밀번호, 성명, 휴대폰 번호, 성별, 생년월일\n- 선택 항목: 건설업 기초안전보건교육 이수증 사진, 계좌 정보, 푸시 알림 수신 설정\n<인력거 Social 계정으로 가입>(카카오톡)\n- 필수 항목: 성명, 휴대폰 번호, 이메일, 성별, 생년월일\n- 선택 항목:  건설업 기초안전보건교육 이수증 사진, 계좌 정보, 푸시 알림 수신 설정\n" +
            "② 기업회원 가입 시\n- 필수 항목: 사업자 등록번호, 비밀번호, 대표자명, 사무소명, 사무소 연락처, 사무소 주소, 담당자 성명, 담당자 휴대폰 번호\n- 선택 항목: 계좌 정보, 푸시 알림 수신 설정\n\n" +
            "3. 개인정보의 수집목적 및 이용목적\n" +
            "① 본 서비스는 다음과 같은 목적을 위하여 개인정보를 수집하고 있습니다.\n" +
            "- 회원제 서비스 이용에 따른 본인 식별 절차에 이용: 성명, 아이디, 본인인증기관을 통해 인증된 개인식별 번호\n" +
            "- 채용공고 등록대행 서비스 이용자의 회원가입 시 필요한 임시 아이디, 비밀번호 발급절차에 이용:담당자명, 담당자 연락처, 이메일\n" +
            "- 고지 사항 전달, 본인 의사 확인, 불만 처리 등 원활한 의사 소통 경로의 확보, 새로운 서비스/신상품이나 이벤트 정보의 안내: 이메일, 전화번호\n" +
            "- 본인 인증 및 유료 정보 이용에 대한 요금 결제: 본인인증기관을 통해 인증된 개인식별 번호, 신용 카드 정보, 은행 계좌 정보, 전화번호, 휴대폰 번호\n" +
            "- 마케팅, 인구 통계학적 분석 자료 (이용자의 연령별, 성별, 지역별 통계 분석): 주소, 성별, 생년월일\n" +
            "- 구직 활동 경력 사항: 생년월일, 성별, 전화번호, 주소, 경력\n" +
            "② 단, 이용자의 기본적 인권 침해의 우려가 있는 민감한 개인정보 (민족, 사상 및 신조, 출신지 및 본적지, 정치적 성향 및 범죄 기록, 건강 상태 및 성생활 등)는 수집하지 않습니다.\n\n" +
            "5. 개인정보의 이용기간 및 보유기간\n" +
            "이용자가 (주)휘뚜루마뚜루의 회원으로서 (주)휘뚜루마뚜루에서 제공하는 서비스를 이용하는 동안에 한하여 (주)휘뚜루마뚜루는 이용자의 개인정보를 보유 및 이용하며, 이용자가 회원탈퇴를 요청하거나, 개인정보의 수집 및 이용에 대한 동의를 철회하는 경우 및 개인정보의 수집목적 또는 제공받은 목적이 달성되거나 이용기간이 종료된 경우, 개인정보를 지체 없이 파기 합니다. 또한, 이용자가 (주)휘뚜루마뚜루에서 제공하는 서비스에 이용자가 선택한 개인정보 보유기간(1년, 3년, 회원탈퇴시) 동안 로그인 등 이용 기록이 없을 경우에는 (주)휘뚜루마뚜루는 이용자의 계정을 휴면계정처리 하여 개인정보를 분리·저장하고 해당 이용자의 서비스 이용을 제한할 수 있으며, 이용자가 직접 본인확인을 거쳐 서비스 이용의사를 표시 한 경우에는 서비스이용이 가능합니다. 이 경우 휴면계정처리 예정일로부터 30일 이전에 해당 사실을 전자메일, 서면, SMS 중 하나의 방법으로 이용자에게 사전 통지하고 이용자가 로그인 등으로 서비스 이용의사표시를 한 경우에는 이용의사표시 일로부터 이용자가 선택한 개인정보 보유기간(1년, 3년, 회원탈퇴시) 동안 이용자의 계정을 휴면계정처리 하지 않습니다.\n" +
            "또한, 상법, 전자상거래 등에서의 소비자 보호에 관한 법률 등 관련 법령의 규정에 의하여 보존할 필요가 있는 경우 (주)휘뚜루마뚜루는 관계 법령에서 정한 일정한 기간 동안 이용자 정보를 보관합니다.\n" +
            "이 경우 (주)휘뚜루마뚜루는 보관하는 정보를 그 보관의 목적으로만 이용하며 보존 기간은 다음과 같습니다.\n" +
            "① 관련 법령에 의한 정보보호 사유\n" +
            "- 계약 또는 청약 철회 등에 관한 기록: 5년 (전자상거래 등에서의 소비자 보호에 관한 법률)\n" +
            "- 대금 결제 및 재화 등의 공급에 관한 기록: 5년 (전자상거래 등에서의 소비자 보호에 관한 법률)\n" +
            "- 소비자의 불만 또는 분쟁 처리에 관한 기록: 3년 (전자상거래 등에서의 소비자 보호에 관한 법률)\n" +
            "- 표시/ 광고에 관한 기록: 6개월 (전자상거래 등에서의 소비자에 관한 법률)\n" +
            "- 서비스 이용기록, 접속로그, 접속 IP 정보: 3개월 (통신비밀보호법)\n" +
            "② 내부 방침에 의한 정보보호 사유\n" +
            "- 보존 항목: 회원ID, 임시 ID, 개인식별 번호\n" +
            "- 보존 근거: 서비스 이용의 혼선 방지\n" +
            "- 보존 기간: 서비스 종료 시까지\n\n" +
            "6. 개인정보의 열람, 수정 및 삭제\n" +
            "① 정보주체가 제공한 개인정보의 열람, 수정 및 삭제는 언제든지 가능합니다. 회원 탈퇴 또한 홈페이지 상단에 있는 \"정보수정\"을 통하여 언제든지 자유롭게 가능합니다. 또한, 고객센터를 통해 이메일, 전화, FAX 등으로 연락을 주시면 본인 확인 절차를 거친 후 바로 조치하겠습니다.\n" +
            "② (주)미디어윌네트웍스는 이용자가 회원 탈퇴를 하고 개인정보를 파기하는 등의 조치를 취한 경우에는 그 사실을 이용자에게 지체 없이 통지하도록 하겠습니다.\n" +
            "③ 잘못된 정보를 제3자에게 이미 제공한 경우에는 정정 처리 결과를 제3자에게 지체 없이 통지하여 정정하도록 조치하겠습니다.\n" +
            "④ (주)미디어윌네트웍스는 이용자가 개인정보의 오류에 대한 정정을 요청한 경우, 정정을 완료하기 전까지 당해 개인정보를 이용 및 제공을 하지 않습니다.\n" +
            "⑤ 이용자가 개인정보의 삭제를 요구하는 즉시 (주)미디어윌네트웍스가 보유하고 있던 이용자의 모든 데이터는 영구히 재생할 수 없는 형태로 완전 파기 됩니다.\n" +
            "⑥ 탈퇴 절차를 마친 후 정상적으로 로그인 할 수 없으면 모든 정보가 파기된 것입니다.\n" +
            "(주)미디어윌네트웍스는 이용자의 개인정보를 안전하게 처리하며, 유출의 방지를 위하여 다음과 같은 방법을 통하여 개인 정보를 파기합니다.\n" +
            "- 종이에 출력된 개인정보: 분쇄기로 분쇄\n" +
            "- 전자적 파일 형태로 저장된 개인정보: 기록을 재생할 수 없는 기술적 방법을 사용하여 삭제";
    String ToS4 = "제 1 조 (목적)\n" +
            "본 약관은 (주)미디어윌네트웍스(이하 \"회사\"라 합니다)가 제공하는 위치기반서비스(이하 '서비스'라 합니다.)를 이용함에 있어 \"회사\"와 위치기반서비스 약관에 동의한 자(이하 '회원'이라 합니다.) 간에 권리 및 의무, 기타 제반 사항의 정함을 목적으로 합니다.\n\n" +
            "제 2 조 (약관 외 준칙)\n" +
            "본 약관에 명시되지 않은 사항에 대해서는 위치정보의 보호 및 이용 등에 관한 법률(이하 \"위치정보법\"이라 합니다), 전기통신사업법, 정보통신망 이용촉진 및 보호 등에 관한 법률,(이하 \"정보통신망법\"이라 합니다) 개인정보보호법 등 관계법령 및 \"회사\"가 별도로 정한 이용지침 등의 규정에 따릅니다.\n\n" +
            "제 3 조 (서비스 이용 및 약관 변경)\n" +
            "① \"회사\"가 정한 본 약관에 고객이 동의하고, \"회사\"가 승낙함으로써 '서비스' 가입의 효력이 발생합니다.\n" +
            "② '회원'이 온라인에서 본 약관의 \"동의하기\" 버튼을 클릭하였을 경우 본 약관의 내용을 모두 읽고 이를 충분히 이해하였으며, 그 적용에 동의한 것으로 봅니다.\n" +
            "③ \"회사\"는 위치정보의 보호 및 이용 등에 관한 법률, 콘텐츠산업 진흥법, 전자상거래 등에서의 소비자보호에 관한 법률, 소비자기본법 약관의 규제에 관한 법률 등 관련법령을 위배하지 않는 범위에서 본 약관을 개정할 수 있습니다.\n" +
            "④ \"회사\"가 약관을 개정할 경우에는 적용일자 및 개정사유를 명시하여 현행약관과 함께 그 개정약관의 적용일자 10일 전부터 적용일자 이후 상당한 기간 동안 공지합니다.\n" +
            "⑤ '회원'은 변경된 약관이 공지된 지 30일 이내에 거부의사를 표명할 수 있습니다. 서비스 해지를 희망하는 '회원'은 \"회사\"가 정한 소정의 절차를 통해 서비스 해지를 신청할 수 있습니다.\n" +
            "⑥ '회원'이 거부의사를 표시하지 않거나, 시행일 이후에 서비스를 이용하는 경우에는 동의한 것으로 간주합니다.\n\n" +
            "제 4 조 (서비스의 내용)\n" +
            "\"회사\"가 제공하는 서비스는 다음과 같습니다.\n서비스 명: 위치기반 서비스\n서비스 내용: - 위치정보를 이용한 채용 및 인재정보 검색 서비스\n" +
            "- 위치정보를 활용하여 채용 및 인재정보 검색결과 제공 서비스\n" +
            "- 위치정보를 지도 내에 표기하여 채용 및 인재정보 제공하는 서비스\n\n" +
            "제 6 조 (위치정보 수집방법)\n" +
            "\"회사\"는 다음과 같은 방식으로 개인위치정보를 수집합니다.\n" +
            "① 단말기를 이용한 기지국 기반(Cell ID방식)의 실시간 위치정보 수집\n" +
            "② GPS칩이 내장된 전용 단말기를 통해 수집되는 GPS 정보를 통한 위치정보 수집\n" +
            "③ Wi-Fi칩이 내장된 전용 단말기를 통해 수집되는 Wi-Fi 정보를 통한 위치정보 수집";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servicepromise);

        for(int i=0; i<4; i++){
            btns[i] = (Button)findViewById(btnsid[i]);
            btns[i].setOnClickListener(this);
        }

        text1 = (TextView)findViewById(R.id.text1);
        text1.setMovementMethod(new ScrollingMovementMethod());
        text1.setText(ToS1);
        btns[0].setBackground(getDrawable(R.drawable.servicestroke));
    }


    @Override
    public void onClick(View v) {
        for (int i=0; i<4; i++){
            btns[i].setBackground(getDrawable(R.drawable.line));
        }
        switch (v.getId()){
            case R.id.btn1 : text1.setText(ToS1); btns[0].setBackground(getDrawable(R.drawable.servicestroke)); break;
            case R.id.btn2 : text1.setText(ToS2);btns[1].setBackground(getDrawable(R.drawable.servicestroke)); break;
            case R.id.btn3 : text1.setText(ToS3); btns[2].setBackground(getDrawable(R.drawable.servicestroke));break;
            case R.id.btn4 : text1.setText(ToS4); btns[3].setBackground(getDrawable(R.drawable.servicestroke));break;
        }
    }
}
