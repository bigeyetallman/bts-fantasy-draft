package com.bigeyetallman.btsfantasydraft2024.utils

import com.bigeyetallman.btsfantasydraft2024.dto.Player

class Values {

    companion object {

        val PLAYER_TYPE_HITTER = 1
        val PLAYER_TYPE_PITCHER = 2

        val SUNGJIN_INSTAZ = 1
        val ISAAC_TOASTERZ = 2
        val YEJIN_PRINCESS = 3
        val DAEHYUN_SPIDERS = 4
        val TAEMIN_SHINEES = 5
        val DONGJIN_UNIVERSE = 6
        val JUHYUNG_DONGHEEMOMS = 7
        val DONGYUN_MRS = 8

        val userTeamNameMap = mapOf<Int, String>(
            SUNGJIN_INSTAZ to "성진 인스타즈",
            ISAAC_TOASTERZ to "이삭 토스터즈",
            YEJIN_PRINCESS to "예진 프린세스",
            DAEHYUN_SPIDERS to "대현 스파이더스",
            TAEMIN_SHINEES to "태민 샤이니즈",
            DONGJIN_UNIVERSE to "동진 유니버스",
            JUHYUNG_DONGHEEMOMS to "주형 동희맘즈",
            DONGYUN_MRS to "동윤 미세스"
        )

        val userTeamTextColorMap = mapOf<Int, String>(
            SUNGJIN_INSTAZ to "#000000",
            ISAAC_TOASTERZ to "#152484",
            YEJIN_PRINCESS to "#FD2B75",
            DAEHYUN_SPIDERS to "#FF0000",
            TAEMIN_SHINEES to "#000000",
            DONGJIN_UNIVERSE to "#007C36",
            JUHYUNG_DONGHEEMOMS to "#4BB1FD",
            DONGYUN_MRS to "#D18FFF"
        )
    }

    var hitterPlayerMap = mutableMapOf<String, Player>(
        "강민호" to Player(id = 1, "강민호", PLAYER_TYPE_HITTER, "삼성", SUNGJIN_INSTAZ),
        "양의지" to Player(id = 2, "양의지", PLAYER_TYPE_HITTER, "두산", ISAAC_TOASTERZ),
        "이지영" to Player(id = 3, "이지영", PLAYER_TYPE_HITTER, "SSG", YEJIN_PRINCESS),
        "최재훈" to Player(id = 4, "최재훈", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "박동원" to Player(id = 5, "박동원", PLAYER_TYPE_HITTER, "LG", TAEMIN_SHINEES),
        "한준수" to Player(id = 6, "한준수", PLAYER_TYPE_HITTER, "KIA", DONGJIN_UNIVERSE),
        "강백호" to Player(id = 7, "강백호", PLAYER_TYPE_HITTER, "KT", JUHYUNG_DONGHEEMOMS),
        "장성우" to Player(id = 8, "장성우", PLAYER_TYPE_HITTER, "KT", DONGYUN_MRS),
        "최주환" to Player(id = 9, "최주환", PLAYER_TYPE_HITTER, "키움", SUNGJIN_INSTAZ),
        "김범석" to Player(id = 10, "김범석", PLAYER_TYPE_HITTER, "LG", ISAAC_TOASTERZ),
        "디아즈" to Player(id = 11, "디아즈", PLAYER_TYPE_HITTER, "삼성", YEJIN_PRINCESS),
        "채은성" to Player(id = 12, "채은성", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "오스틴" to Player(id = 13, "오스틴", PLAYER_TYPE_HITTER, "LG", TAEMIN_SHINEES),
        "문보경" to Player(id = 14, "문보경", PLAYER_TYPE_HITTER, "LG", DONGJIN_UNIVERSE),
        "문상철" to Player(id = 15, "문상철", PLAYER_TYPE_HITTER, "KT", JUHYUNG_DONGHEEMOMS),
        "양석환" to Player(id = 16, "양석환", PLAYER_TYPE_HITTER, "두산", DONGYUN_MRS),
        "박민우" to Player(id = 17, "박민우", PLAYER_TYPE_HITTER, "NC", SUNGJIN_INSTAZ),
        "김주원" to Player(id = 18, "김주원", PLAYER_TYPE_HITTER, "NC", ISAAC_TOASTERZ),
        "강승호" to Player(id = 19, "강승호", PLAYER_TYPE_HITTER, "두산", YEJIN_PRINCESS),
        "안치홍" to Player(id = 20, "안치홍", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "김선빈" to Player(id = 21, "김선빈", PLAYER_TYPE_HITTER, "KIA", TAEMIN_SHINEES),
        "손호영" to Player(id = 22, "손호영", PLAYER_TYPE_HITTER, "롯데", DONGJIN_UNIVERSE),
        "고승민" to Player(id = 23, "고승민", PLAYER_TYPE_HITTER, "롯데", JUHYUNG_DONGHEEMOMS),
        "신민재" to Player(id = 24, "신민재", PLAYER_TYPE_HITTER, "LG", DONGYUN_MRS),
        "위즈덤" to Player(id = 25, "위즈덤", PLAYER_TYPE_HITTER, "KIA", SUNGJIN_INSTAZ),
        "나승엽" to Player(id = 26, "나승엽", PLAYER_TYPE_HITTER, "롯데", ISAAC_TOASTERZ),
        "김도영" to Player(id = 27, "김도영", PLAYER_TYPE_HITTER, "KIA", YEJIN_PRINCESS),
        "노시환" to Player(id = 28, "노시환", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "송성문" to Player(id = 29, "송성문", PLAYER_TYPE_HITTER, "키움", TAEMIN_SHINEES),
        "최정" to Player(id = 30, "최정", PLAYER_TYPE_HITTER, "SSG", DONGJIN_UNIVERSE),
        "허경민" to Player(id = 31, "허경민", PLAYER_TYPE_HITTER, "KT", JUHYUNG_DONGHEEMOMS),
        "데이비슨" to Player(id = 32, "데이비슨", PLAYER_TYPE_HITTER, "NC", DONGYUN_MRS),
        "김지찬" to Player(id = 33, "김지찬", PLAYER_TYPE_HITTER, "삼성", SUNGJIN_INSTAZ),
        "오지환" to Player(id = 34, "오지환", PLAYER_TYPE_HITTER, "LG", ISAAC_TOASTERZ),
        "박준영" to Player(id = 35, "박준영", PLAYER_TYPE_HITTER, "두산", YEJIN_PRINCESS),
        "박찬호" to Player(id = 36, "박찬호", PLAYER_TYPE_HITTER, "KIA", DAEHYUN_SPIDERS),
        "김영웅" to Player(id = 37, "김영웅", PLAYER_TYPE_HITTER, "삼성", TAEMIN_SHINEES),
        "박성한" to Player(id = 38, "박성한", PLAYER_TYPE_HITTER, "SSG", DONGJIN_UNIVERSE),
        "이재현" to Player(id = 39, "이재현", PLAYER_TYPE_HITTER, "삼성", JUHYUNG_DONGHEEMOMS),
        "김상수" to Player(id = 40, "김상수", PLAYER_TYPE_HITTER, "KT", DONGYUN_MRS),
        "문성주" to Player(id = 41, "문성주", PLAYER_TYPE_HITTER, "LG", SUNGJIN_INSTAZ),
        "김현수" to Player(id = 42, "김현수", PLAYER_TYPE_HITTER, "LG", ISAAC_TOASTERZ),
        "김재환" to Player(id = 43, "김재환", PLAYER_TYPE_HITTER, "두산", YEJIN_PRINCESS),
        "최인호" to Player(id = 44, "최인호", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "케이브" to Player(id = 45, "케이브", PLAYER_TYPE_HITTER, "두산", TAEMIN_SHINEES),
        "황성빈" to Player(id = 46, "황성빈", PLAYER_TYPE_HITTER, "롯데", DONGJIN_UNIVERSE),
        "전준우" to Player(id = 47, "전준우", PLAYER_TYPE_HITTER, "롯데", JUHYUNG_DONGHEEMOMS),
        "구자욱" to Player(id = 48, "구자욱", PLAYER_TYPE_HITTER, "삼성", DONGYUN_MRS),
        "최원준" to Player(id = 49, "최원준", PLAYER_TYPE_HITTER, "KIA", SUNGJIN_INSTAZ),
        "이주형" to Player(id = 50, "이주형", PLAYER_TYPE_HITTER, "키움", ISAAC_TOASTERZ),
        "박건우" to Player(id = 51, "박건우", PLAYER_TYPE_HITTER, "NC", YEJIN_PRINCESS),
        "플로리얼" to Player(id = 52, "플로리얼", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "정수빈" to Player(id = 53, "정수빈", PLAYER_TYPE_HITTER, "두산", TAEMIN_SHINEES),
        "에레디아" to Player(id = 54, "에레디아", PLAYER_TYPE_HITTER, "SSG", DONGJIN_UNIVERSE),
        "윤동희" to Player(id = 55, "윤동희", PLAYER_TYPE_HITTER, "롯데", JUHYUNG_DONGHEEMOMS),
        "배정대" to Player(id = 56, "배정대", PLAYER_TYPE_HITTER, "KT", DONGYUN_MRS),
        "이우성" to Player(id = 57, "이우성", PLAYER_TYPE_HITTER, "KIA", SUNGJIN_INSTAZ),
        "나성범" to Player(id = 58, "나성범", PLAYER_TYPE_HITTER, "KIA", ISAAC_TOASTERZ),
        "홍창기" to Player(id = 59, "홍창기", PLAYER_TYPE_HITTER, "LG", YEJIN_PRINCESS),
        "이성규" to Player(id = 60, "이성규", PLAYER_TYPE_HITTER, "삼성", DAEHYUN_SPIDERS),
        "김민혁" to Player(id = 61, "김민혁", PLAYER_TYPE_HITTER, "KT", TAEMIN_SHINEES),
        "로하스" to Player(id = 62, "로하스", PLAYER_TYPE_HITTER, "KT", DONGJIN_UNIVERSE),
        "최지훈" to Player(id = 63, "최지훈", PLAYER_TYPE_HITTER, "SSG", JUHYUNG_DONGHEEMOMS),
        "권희동" to Player(id = 64, "권희동", PLAYER_TYPE_HITTER, "NC", DONGYUN_MRS),
        "최형우" to Player(id = 65, "최형우", PLAYER_TYPE_HITTER, "KIA", SUNGJIN_INSTAZ),
        "푸이그" to Player(id = 66, "푸이그", PLAYER_TYPE_HITTER, "키움", ISAAC_TOASTERZ),
        "한유섬" to Player(id = 67, "한유섬", PLAYER_TYPE_HITTER, "SSG", YEJIN_PRINCESS),
        "손아섭" to Player(id = 68, "손아섭", PLAYER_TYPE_HITTER, "NC", DAEHYUN_SPIDERS),
        "김태연" to Player(id = 69, "김태연", PLAYER_TYPE_HITTER, "한화", TAEMIN_SHINEES),
        "박병호" to Player(id = 70, "박병호", PLAYER_TYPE_HITTER, "삼성", DONGJIN_UNIVERSE),
        "카디네스" to Player(id = 71, "카디네스", PLAYER_TYPE_HITTER, "키움", JUHYUNG_DONGHEEMOMS),
        "박해민" to Player(id = 72, "박해민", PLAYER_TYPE_HITTER, "LG", DONGYUN_MRS)
    )

    var pitcherPlayerMap = mutableMapOf<String, Player>(
        "레예스" to Player(id = 1, "레예스", PLAYER_TYPE_PITCHER, "삼성", SUNGJIN_INSTAZ),
        "류현진" to Player(id = 2, "류현진", PLAYER_TYPE_PITCHER, "한화", ISAAC_TOASTERZ),
        "원태인" to Player(id = 3, "원태인", PLAYER_TYPE_PITCHER, "삼성", YEJIN_PRINCESS),
        "네일" to Player(id = 4, "네일", PLAYER_TYPE_PITCHER, "KIA", DAEHYUN_SPIDERS),
        "데이비슨" to Player(id = 5, "데이비슨", PLAYER_TYPE_PITCHER, "롯데", TAEMIN_SHINEES),
        "치리노스" to Player(id = 6, "치리노스", PLAYER_TYPE_PITCHER, "LG", DONGJIN_UNIVERSE),
        "반즈" to Player(id = 7, "반즈", PLAYER_TYPE_PITCHER, "롯데", JUHYUNG_DONGHEEMOMS),
        "폰세" to Player(id = 8, "폰세", PLAYER_TYPE_PITCHER, "한화", DONGYUN_MRS),
        "올러" to Player(id = 9, "올러", PLAYER_TYPE_PITCHER, "KIA", SUNGJIN_INSTAZ),
        "헤이수스" to Player(id = 10, "헤이수스", PLAYER_TYPE_PITCHER, "KT", ISAAC_TOASTERZ),
        "최원태" to Player(id = 11, "최원태", PLAYER_TYPE_PITCHER, "삼성", YEJIN_PRINCESS),
        "콜어빈" to Player(id = 12, "콜어빈", PLAYER_TYPE_PITCHER, "두산", DAEHYUN_SPIDERS),
        "소형준" to Player(id = 13, "소형준", PLAYER_TYPE_PITCHER, "KT", TAEMIN_SHINEES),
        "양현종" to Player(id = 14, "양현종", PLAYER_TYPE_PITCHER, "KIA", DONGJIN_UNIVERSE),
        "라일리" to Player(id = 15, "라일리", PLAYER_TYPE_PITCHER, "NC", JUHYUNG_DONGHEEMOMS),
        "후라도" to Player(id = 16, "후라도", PLAYER_TYPE_PITCHER, "삼성", DONGYUN_MRS),
        "곽빈" to Player(id = 17, "곽빈", PLAYER_TYPE_PITCHER, "두산", SUNGJIN_INSTAZ),
        "박세웅" to Player(id = 18, "박세웅", PLAYER_TYPE_PITCHER, "롯데", ISAAC_TOASTERZ),
        "와이스" to Player(id = 19, "와이스", PLAYER_TYPE_PITCHER, "한화", YEJIN_PRINCESS),
        "엄상백" to Player(id = 20, "엄상백", PLAYER_TYPE_PITCHER, "한화", DAEHYUN_SPIDERS),
        "임찬규" to Player(id = 21, "임찬규", PLAYER_TYPE_PITCHER, "LG", TAEMIN_SHINEES),
        "하영민" to Player(id = 22, "하영민", PLAYER_TYPE_PITCHER, "키움", DONGJIN_UNIVERSE),
        "고영표" to Player(id = 23, "고영표", PLAYER_TYPE_PITCHER, "KT", JUHYUNG_DONGHEEMOMS),
        "송영진" to Player(id = 24, "송영진", PLAYER_TYPE_PITCHER, "SSG", DONGYUN_MRS),
        "손주영" to Player(id = 25, "손주영", PLAYER_TYPE_PITCHER, "LG", SUNGJIN_INSTAZ),
        "문동주" to Player(id = 26, "문동주", PLAYER_TYPE_PITCHER, "한화", ISAAC_TOASTERZ),
        "로젠버그" to Player(id = 27, "로젠버그", PLAYER_TYPE_PITCHER, "키움", YEJIN_PRINCESS),
        "김도현" to Player(id = 28, "김도현", PLAYER_TYPE_PITCHER, "KIA", DAEHYUN_SPIDERS),
        "이의리" to Player(id = 29, "이의리", PLAYER_TYPE_PITCHER, "KIA", TAEMIN_SHINEES),
        "김광현" to Player(id = 30, "김광현", PLAYER_TYPE_PITCHER, "SSG", DONGJIN_UNIVERSE),
        "오원석" to Player(id = 31, "오원석", PLAYER_TYPE_PITCHER, "KT", JUHYUNG_DONGHEEMOMS),
        "최채흥" to Player(id = 32, "최채흥", PLAYER_TYPE_PITCHER, "삼성", DONGYUN_MRS),
        "이승현(좌)" to Player(id = 33, "이승현(좌)", PLAYER_TYPE_PITCHER, "삼성", SUNGJIN_INSTAZ),
        "이정용" to Player(id = 34, "이정용", PLAYER_TYPE_PITCHER, "LG", ISAAC_TOASTERZ),
        "신민혁" to Player(id = 35, "신민혁", PLAYER_TYPE_PITCHER, "NC", YEJIN_PRINCESS),
        "정현우" to Player(id = 36, "정현우", PLAYER_TYPE_PITCHER, "키움", DAEHYUN_SPIDERS),
        "백정현" to Player(id = 37, "백정현", PLAYER_TYPE_PITCHER, "삼성", TAEMIN_SHINEES),
        "이지강" to Player(id = 38, "이지강", PLAYER_TYPE_PITCHER, "LG", DONGJIN_UNIVERSE),
        "문승원" to Player(id = 39, "문승원", PLAYER_TYPE_PITCHER, "SSG", JUHYUNG_DONGHEEMOMS),
        "임기영" to Player(id = 40, "임기영", PLAYER_TYPE_PITCHER, "KIA", DONGYUN_MRS),
        "장현식" to Player(id = 41, "장현식", PLAYER_TYPE_PITCHER, "LG", SUNGJIN_INSTAZ),
        "조상우" to Player(id = 42, "조상우", PLAYER_TYPE_PITCHER, "KIA", ISAAC_TOASTERZ),
        "김택연" to Player(id = 43, "김택연", PLAYER_TYPE_PITCHER, "두산", YEJIN_PRINCESS),
        "김서현" to Player(id = 44, "김서현", PLAYER_TYPE_PITCHER, "한화", DAEHYUN_SPIDERS),
        "전상현" to Player(id = 45, "전상현", PLAYER_TYPE_PITCHER, "KIA", TAEMIN_SHINEES),
        "손동현" to Player(id = 46, "손동현", PLAYER_TYPE_PITCHER, "KT", DONGJIN_UNIVERSE),
        "김원중" to Player(id = 47, "김원중", PLAYER_TYPE_PITCHER, "롯데", JUHYUNG_DONGHEEMOMS),
        "박영현" to Player(id = 48, "박영현", PLAYER_TYPE_PITCHER, "KT", DONGYUN_MRS),
        "박명근" to Player(id = 49, "박명근", PLAYER_TYPE_PITCHER, "LG", SUNGJIN_INSTAZ),
        "노경은" to Player(id = 50, "노경은", PLAYER_TYPE_PITCHER, "SSG", ISAAC_TOASTERZ),
        "이병헌" to Player(id = 51, "이병헌", PLAYER_TYPE_PITCHER, "두산", YEJIN_PRINCESS),
        "정우주" to Player(id = 52, "정우주", PLAYER_TYPE_PITCHER, "한화", DAEHYUN_SPIDERS),
        "조병현" to Player(id = 53, "조병현", PLAYER_TYPE_PITCHER, "SSG", TAEMIN_SHINEES),
        "김진성" to Player(id = 54, "김진성", PLAYER_TYPE_PITCHER, "LG", DONGJIN_UNIVERSE),
        "김민" to Player(id = 55, "김민", PLAYER_TYPE_PITCHER, "SSG", JUHYUNG_DONGHEEMOMS),
        "정해영" to Player(id = 56, "정해영", PLAYER_TYPE_PITCHER, "KIA", DONGYUN_MRS),
        "김강률" to Player(id = 57, "김강률", PLAYER_TYPE_PITCHER, "LG", SUNGJIN_INSTAZ),
        "화이트" to Player(id = 58, "화이트", PLAYER_TYPE_PITCHER, "SSG", ISAAC_TOASTERZ),
        "홍건희" to Player(id = 59, "홍건희", PLAYER_TYPE_PITCHER, "두산", YEJIN_PRINCESS),
        "박상원" to Player(id = 60, "박상원", PLAYER_TYPE_PITCHER, "한화", DAEHYUN_SPIDERS),
        "김재윤" to Player(id = 61, "김재윤", PLAYER_TYPE_PITCHER, "삼성", TAEMIN_SHINEES),
        "송승기" to Player(id = 62, "송승기", PLAYER_TYPE_PITCHER, "LG", DONGJIN_UNIVERSE),
        "김민수" to Player(id = 63, "김민수", PLAYER_TYPE_PITCHER, "KT", JUHYUNG_DONGHEEMOMS),
        "최지강" to Player(id = 64, "최지강", PLAYER_TYPE_PITCHER, "두산", DONGYUN_MRS),
        "김태훈" to Player(id = 65, "김태훈", PLAYER_TYPE_PITCHER, "삼성", SUNGJIN_INSTAZ),
        "이강준" to Player(id = 66, "이강준", PLAYER_TYPE_PITCHER, "키움", ISAAC_TOASTERZ),
        "이준영" to Player(id = 67, "이준영", PLAYER_TYPE_PITCHER, "KIA", YEJIN_PRINCESS),
        "정철원" to Player(id = 68, "정철원", PLAYER_TYPE_PITCHER, "롯데", DAEHYUN_SPIDERS),
        "주승우" to Player(id = 69, "주승우", PLAYER_TYPE_PITCHER, "키움", TAEMIN_SHINEES),
        "백승현" to Player(id = 70, "백승현", PLAYER_TYPE_PITCHER, "LG", DONGJIN_UNIVERSE),
        "서진용" to Player(id = 71, "서진용", PLAYER_TYPE_PITCHER, "SSG", JUHYUNG_DONGHEEMOMS),
        "우규민" to Player(id = 72, "우규민", PLAYER_TYPE_PITCHER, "KT", DONGYUN_MRS),
    )

    //이전 점수 여기에 추가
    var userTotalPointMap = mutableMapOf<Int, Double>(
        SUNGJIN_INSTAZ to 2395.6,
        ISAAC_TOASTERZ to 2894.2,
        YEJIN_PRINCESS to 2006.4,
        DAEHYUN_SPIDERS to 2681.8,
        TAEMIN_SHINEES to 3515.6,
        DONGJIN_UNIVERSE to 1771.0,
        JUHYUNG_DONGHEEMOMS to 2561.0,
        DONGYUN_MRS to 1398.9,
    )

}