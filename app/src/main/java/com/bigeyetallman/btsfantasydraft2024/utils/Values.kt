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
        "김태군" to Player(id = 1, "김태군", PLAYER_TYPE_HITTER, "KIA", SUNGJIN_INSTAZ),
        "김형준" to Player(id = 2, "김형준", PLAYER_TYPE_HITTER, "NC", ISAAC_TOASTERZ),
        "박동원" to Player(id = 3, "박동원", PLAYER_TYPE_HITTER, "LG", YEJIN_PRINCESS),
        "강민호" to Player(id = 4, "강민호", PLAYER_TYPE_HITTER, "삼성", DAEHYUN_SPIDERS),
        "양의지" to Player(id = 5, "양의지", PLAYER_TYPE_HITTER, "두산", TAEMIN_SHINEES),
        "최재훈" to Player(id = 6, "최재훈", PLAYER_TYPE_HITTER, "한화", DONGJIN_UNIVERSE),
        "유강남" to Player(id = 7, "유강남", PLAYER_TYPE_HITTER, "롯데", JUHYUNG_DONGHEEMOMS),
        "장성우" to Player(id = 8, "장성우", PLAYER_TYPE_HITTER, "KT", DONGYUN_MRS),
        "최원준" to Player(id = 9, "최원준", PLAYER_TYPE_HITTER, "KIA", SUNGJIN_INSTAZ),
        "오스틴" to Player(id = 10, "오스틴", PLAYER_TYPE_HITTER, "LG", ISAAC_TOASTERZ),
        "양석환" to Player(id = 11, "양석환", PLAYER_TYPE_HITTER, "두산", YEJIN_PRINCESS),
        "안치홍" to Player(id = 12, "안치홍", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "채은성" to Player(id = 13, "채은성", PLAYER_TYPE_HITTER, "한화", TAEMIN_SHINEES),
        "최주환" to Player(id = 14, "최주환", PLAYER_TYPE_HITTER, "키움", DONGJIN_UNIVERSE),
        "고승민" to Player(id = 15, "고승민", PLAYER_TYPE_HITTER, "롯데", JUHYUNG_DONGHEEMOMS),
        "송성문" to Player(id = 16, "송성문", PLAYER_TYPE_HITTER, "키움", DONGYUN_MRS),
        "박민우" to Player(id = 17, "박민우", PLAYER_TYPE_HITTER, "NC", SUNGJIN_INSTAZ),
        "천성호" to Player(id = 18, "천성호", PLAYER_TYPE_HITTER, "KT", ISAAC_TOASTERZ),
        "김선빈" to Player(id = 19, "김선빈", PLAYER_TYPE_HITTER, "KIA", YEJIN_PRINCESS),
        "문현빈" to Player(id = 20, "문현빈", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "신민재" to Player(id = 21, "신민재", PLAYER_TYPE_HITTER, "LG", TAEMIN_SHINEES),
        "김지찬" to Player(id = 22, "김지찬", PLAYER_TYPE_HITTER, "삼성", DONGJIN_UNIVERSE),
        "김혜성" to Player(id = 23, "김혜성", PLAYER_TYPE_HITTER, "키움", JUHYUNG_DONGHEEMOMS),
        "강승호" to Player(id = 24, "강승호", PLAYER_TYPE_HITTER, "두산", DONGYUN_MRS),
        "김영웅" to Player(id = 25, "김영웅", PLAYER_TYPE_HITTER, "삼성", SUNGJIN_INSTAZ),
        "허경민" to Player(id = 26, "허경민", PLAYER_TYPE_HITTER, "두산", ISAAC_TOASTERZ),
        "황재균" to Player(id = 27, "황재균", PLAYER_TYPE_HITTER, "KT", YEJIN_PRINCESS),
        "노시환" to Player(id = 28, "노시환", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "김도영" to Player(id = 29, "김도영", PLAYER_TYPE_HITTER, "KIA", TAEMIN_SHINEES),
        "문보경" to Player(id = 30, "문보경", PLAYER_TYPE_HITTER, "LG", DONGJIN_UNIVERSE),
        "최정" to Player(id = 31, "최정", PLAYER_TYPE_HITTER, "SSG", JUHYUNG_DONGHEEMOMS),
        "서호철" to Player(id = 32, "서호철", PLAYER_TYPE_HITTER, "NC", DONGYUN_MRS),
        "박찬호" to Player(id = 33, "박찬호", PLAYER_TYPE_HITTER, "KIA", SUNGJIN_INSTAZ),
        "김주원" to Player(id = 34, "김주원", PLAYER_TYPE_HITTER, "NC", ISAAC_TOASTERZ),
        "김상수" to Player(id = 35, "김상수", PLAYER_TYPE_HITTER, "KT", YEJIN_PRINCESS),
        "박성한" to Player(id = 36, "박성한", PLAYER_TYPE_HITTER, "SSG", DAEHYUN_SPIDERS),
        "하주석" to Player(id = 37, "하주석", PLAYER_TYPE_HITTER, "한화", TAEMIN_SHINEES),
        "노진혁" to Player(id = 38, "노진혁", PLAYER_TYPE_HITTER, "롯데", DONGJIN_UNIVERSE),
        "박준영" to Player(id = 39, "박준영", PLAYER_TYPE_HITTER, "두산", JUHYUNG_DONGHEEMOMS),
        "오지환" to Player(id = 40, "오지환", PLAYER_TYPE_HITTER, "LG", DONGYUN_MRS),
        "문성주" to Player(id = 41, "문성주", PLAYER_TYPE_HITTER, "LG", SUNGJIN_INSTAZ),
        "권희동" to Player(id = 42, "권희동", PLAYER_TYPE_HITTER, "NC", ISAAC_TOASTERZ),
        "김현수" to Player(id = 43, "김현수", PLAYER_TYPE_HITTER, "LG", YEJIN_PRINCESS),
        "김성윤" to Player(id = 44, "김성윤", PLAYER_TYPE_HITTER, "삼성", DAEHYUN_SPIDERS),
        "이우성" to Player(id = 45, "이우성", PLAYER_TYPE_HITTER, "KIA", TAEMIN_SHINEES),
        "홍창기" to Player(id = 46, "홍창기", PLAYER_TYPE_HITTER, "LG", DONGJIN_UNIVERSE),
        "구자욱" to Player(id = 47, "구자욱", PLAYER_TYPE_HITTER, "삼성", JUHYUNG_DONGHEEMOMS),
        "에레디아" to Player(id = 48, "에레디아", PLAYER_TYPE_HITTER, "SSG", DONGYUN_MRS),
        "박해민" to Player(id = 49, "박해민", PLAYER_TYPE_HITTER, "LG", SUNGJIN_INSTAZ),
        "김범석" to Player(id = 50, "김범석", PLAYER_TYPE_HITTER, "LG", ISAAC_TOASTERZ),
        "소크라테스" to Player(id = 51, "소크라테스", PLAYER_TYPE_HITTER, "KIA", YEJIN_PRINCESS),
        "정수빈" to Player(id = 52, "정수빈", PLAYER_TYPE_HITTER, "두산", DAEHYUN_SPIDERS),
        "최지훈" to Player(id = 53, "최지훈", PLAYER_TYPE_HITTER, "SSG", TAEMIN_SHINEES),
        "도슨" to Player(id = 54, "도슨", PLAYER_TYPE_HITTER, "키움", DONGJIN_UNIVERSE),
        "배정대" to Player(id = 55, "배정대", PLAYER_TYPE_HITTER, "KT", JUHYUNG_DONGHEEMOMS),
        "이주형" to Player(id = 56, "이주형", PLAYER_TYPE_HITTER, "키움", DONGYUN_MRS),
        "페라자" to Player(id = 57, "페라자", PLAYER_TYPE_HITTER, "한화", SUNGJIN_INSTAZ),
        "윤동희" to Player(id = 58, "윤동희", PLAYER_TYPE_HITTER, "롯데", ISAAC_TOASTERZ),
        "박건우" to Player(id = 59, "박건우", PLAYER_TYPE_HITTER, "NC", YEJIN_PRINCESS),
        "임종찬" to Player(id = 60, "임종찬", PLAYER_TYPE_HITTER, "한화", DAEHYUN_SPIDERS),
        "레이예스" to Player(id = 61, "레이예스", PLAYER_TYPE_HITTER, "롯데", TAEMIN_SHINEES),
        "손아섭" to Player(id = 62, "손아섭", PLAYER_TYPE_HITTER, "NC", DONGJIN_UNIVERSE),
        "로하스" to Player(id = 63, "로하스", PLAYER_TYPE_HITTER, "KT", JUHYUNG_DONGHEEMOMS),
        "한유섬" to Player(id = 64, "한유섬", PLAYER_TYPE_HITTER, "SSG", DONGYUN_MRS),
        "최형우" to Player(id = 65, "최형우", PLAYER_TYPE_HITTER, "KIA", SUNGJIN_INSTAZ),
        "김재환" to Player(id = 66, "김재환", PLAYER_TYPE_HITTER, "두산", ISAAC_TOASTERZ),
        "나성범" to Player(id = 67, "나성범", PLAYER_TYPE_HITTER, "KIA", YEJIN_PRINCESS),
        "전준우" to Player(id = 68, "전준우", PLAYER_TYPE_HITTER, "롯데", DAEHYUN_SPIDERS),
        "문상철" to Player(id = 69, "문상철", PLAYER_TYPE_HITTER, "KT", TAEMIN_SHINEES),
        "이재현" to Player(id = 70, "이재현", PLAYER_TYPE_HITTER, "삼성", DONGJIN_UNIVERSE),
        "강백호" to Player(id = 71, "강백호", PLAYER_TYPE_HITTER, "KT", JUHYUNG_DONGHEEMOMS),
        "박병호" to Player(id = 72, "박병호", PLAYER_TYPE_HITTER, "삼성", DONGYUN_MRS)
    )

    var pitcherPlayerMap = mutableMapOf<String, Player>(
        "코너" to Player(id = 1, "코너", PLAYER_TYPE_PITCHER, "삼성", SUNGJIN_INSTAZ),
        "류현진" to Player(id = 2, "류현진", PLAYER_TYPE_PITCHER, "한화", ISAAC_TOASTERZ),
        "쿠에바스" to Player(id = 3, "쿠에바스", PLAYER_TYPE_PITCHER, "KT", YEJIN_PRINCESS),
        "레예스" to Player(id = 4, "레예스", PLAYER_TYPE_PITCHER, "삼성", DAEHYUN_SPIDERS),
        "알칸타라" to Player(id = 5, "알칸타라", PLAYER_TYPE_PITCHER, "두산", TAEMIN_SHINEES),
        "고영표" to Player(id = 6, "고영표", PLAYER_TYPE_PITCHER, "KT", DONGJIN_UNIVERSE),
        "곽빈" to Player(id = 7, "곽빈", PLAYER_TYPE_PITCHER, "두산", JUHYUNG_DONGHEEMOMS),
        "벤자민" to Player(id = 8, "벤자민", PLAYER_TYPE_PITCHER, "KT", DONGYUN_MRS),
        "네일" to Player(id = 9, "네일", PLAYER_TYPE_PITCHER, "KIA", SUNGJIN_INSTAZ),
        "엔스" to Player(id = 10, "엔스", PLAYER_TYPE_PITCHER, "LG", ISAAC_TOASTERZ),
        "브랜든" to Player(id = 11, "브랜든", PLAYER_TYPE_PITCHER, "두산", YEJIN_PRINCESS),
        "반즈" to Player(id = 12, "반즈", PLAYER_TYPE_PITCHER, "롯데", DAEHYUN_SPIDERS),
        "엘리아스" to Player(id = 13, "엘리아스", PLAYER_TYPE_PITCHER, "SSG", TAEMIN_SHINEES),
        "후라도" to Player(id = 14, "후라도", PLAYER_TYPE_PITCHER, "키움", DONGJIN_UNIVERSE),
        "하트" to Player(id = 15, "하트", PLAYER_TYPE_PITCHER, "NC", JUHYUNG_DONGHEEMOMS),
        "임찬규" to Player(id = 16, "임찬규", PLAYER_TYPE_PITCHER, "LG", DONGYUN_MRS),
        "엄상백" to Player(id = 17, "엄상백", PLAYER_TYPE_PITCHER, "KT", SUNGJIN_INSTAZ),
        "문동주" to Player(id = 18, "문동주", PLAYER_TYPE_PITCHER, "한화", ISAAC_TOASTERZ),
        "양현종" to Player(id = 19, "양현종", PLAYER_TYPE_PITCHER, "KIA", YEJIN_PRINCESS),
        "원태인" to Player(id = 20, "원태인", PLAYER_TYPE_PITCHER, "삼성", DAEHYUN_SPIDERS),
        "윤영철" to Player(id = 21, "윤영철", PLAYER_TYPE_PITCHER, "KIA", TAEMIN_SHINEES),
        "켈리" to Player(id = 22, "켈리", PLAYER_TYPE_PITCHER, "LG", DONGJIN_UNIVERSE),
        "박세웅" to Player(id = 23, "박세웅", PLAYER_TYPE_PITCHER, "롯데", JUHYUNG_DONGHEEMOMS),
        "황준서" to Player(id = 24, "황준서", PLAYER_TYPE_PITCHER, "한화", DONGYUN_MRS),
        "신민혁" to Player(id = 25, "신민혁", PLAYER_TYPE_PITCHER, "NC", SUNGJIN_INSTAZ),
        "크로우" to Player(id = 26, "크로우", PLAYER_TYPE_PITCHER, "KIA", ISAAC_TOASTERZ),
        "나균안" to Player(id = 27, "나균안", PLAYER_TYPE_PITCHER, "롯데", YEJIN_PRINCESS),
        "김민우" to Player(id = 28, "김민우", PLAYER_TYPE_PITCHER, "한화", DAEHYUN_SPIDERS),
        "손주영" to Player(id = 29, "손주영", PLAYER_TYPE_PITCHER, "LG", TAEMIN_SHINEES),
        "최원태" to Player(id = 30, "최원태", PLAYER_TYPE_PITCHER, "LG", DONGJIN_UNIVERSE),
        "윌커슨" to Player(id = 31, "윌커슨", PLAYER_TYPE_PITCHER, "롯데", JUHYUNG_DONGHEEMOMS),
        "카스타노" to Player(id = 32, "카스타노", PLAYER_TYPE_PITCHER, "NC", DONGYUN_MRS),
        "박영현" to Player(id = 33, "박영현", PLAYER_TYPE_PITCHER, "KT", SUNGJIN_INSTAZ),
        "오승환" to Player(id = 34, "오승환", PLAYER_TYPE_PITCHER, "삼성", ISAAC_TOASTERZ),
        "이용찬" to Player(id = 35, "이용찬", PLAYER_TYPE_PITCHER, "NC", YEJIN_PRINCESS),
        "김택연" to Player(id = 36, "김택연", PLAYER_TYPE_PITCHER, "두산", DAEHYUN_SPIDERS),
        "정해영" to Player(id = 37, "정해영", PLAYER_TYPE_PITCHER, "KIA", TAEMIN_SHINEES),
        "김진성" to Player(id = 38, "김진성", PLAYER_TYPE_PITCHER, "LG", DONGJIN_UNIVERSE),
        "김원중" to Player(id = 39, "김원중", PLAYER_TYPE_PITCHER, "롯데", JUHYUNG_DONGHEEMOMS),
        "서진용" to Player(id = 40, "서진용", PLAYER_TYPE_PITCHER, "SSG", DONGYUN_MRS),
        "유영찬" to Player(id = 41, "유영찬", PLAYER_TYPE_PITCHER, "LG", SUNGJIN_INSTAZ),
        "최지민" to Player(id = 42, "최지민", PLAYER_TYPE_PITCHER, "KIA", ISAAC_TOASTERZ),
        "손동현" to Player(id = 43, "손동현", PLAYER_TYPE_PITCHER, "KT", YEJIN_PRINCESS),
        "류진욱" to Player(id = 44, "류진욱", PLAYER_TYPE_PITCHER, "NC", DAEHYUN_SPIDERS),
        "전상현" to Player(id = 45, "전상현", PLAYER_TYPE_PITCHER, "KIA", TAEMIN_SHINEES),
        "김재웅" to Player(id = 46, "김재웅", PLAYER_TYPE_PITCHER, "키움", DONGJIN_UNIVERSE),
        "조상우" to Player(id = 47, "조상우", PLAYER_TYPE_PITCHER, "키움", JUHYUNG_DONGHEEMOMS),
        "김재윤" to Player(id = 48, "김재윤", PLAYER_TYPE_PITCHER, "삼성", DONGYUN_MRS),
        "백승현" to Player(id = 49, "백승현", PLAYER_TYPE_PITCHER, "LG", SUNGJIN_INSTAZ),
        "노경은" to Player(id = 50, "노경은", PLAYER_TYPE_PITCHER, "SSG", ISAAC_TOASTERZ),
        "정철원" to Player(id = 51, "정철원", PLAYER_TYPE_PITCHER, "두산", YEJIN_PRINCESS),
        "김서현" to Player(id = 52, "김서현", PLAYER_TYPE_PITCHER, "한화", DAEHYUN_SPIDERS),
        "임창민" to Player(id = 53, "임창민", PLAYER_TYPE_PITCHER, "삼성", TAEMIN_SHINEES),
        "김영규" to Player(id = 54, "김영규", PLAYER_TYPE_PITCHER, "NC", DONGJIN_UNIVERSE),
        "김태훈" to Player(id = 55, "김태훈", PLAYER_TYPE_PITCHER, "삼성", JUHYUNG_DONGHEEMOMS),
        "박명근" to Player(id = 56, "박명근", PLAYER_TYPE_PITCHER, "LG", DONGYUN_MRS),
        "박치국" to Player(id = 57, "박치국", PLAYER_TYPE_PITCHER, "두산", SUNGJIN_INSTAZ),
        "우규민" to Player(id = 58, "우규민", PLAYER_TYPE_PITCHER, "KT", ISAAC_TOASTERZ),
        "조병현" to Player(id = 59, "조병현", PLAYER_TYPE_PITCHER, "SSG", YEJIN_PRINCESS),
        "주현상" to Player(id = 60, "주현상", PLAYER_TYPE_PITCHER, "한화", DAEHYUN_SPIDERS),
        "곽도규" to Player(id = 61, "곽도규", PLAYER_TYPE_PITCHER, "KIA", TAEMIN_SHINEES),
        "한승혁" to Player(id = 62, "한승혁", PLAYER_TYPE_PITCHER, "한화", DONGJIN_UNIVERSE),
        "최준용" to Player(id = 63, "최준용", PLAYER_TYPE_PITCHER, "롯데", JUHYUNG_DONGHEEMOMS),
        "문승원" to Player(id = 64, "문승원", PLAYER_TYPE_PITCHER, "SSG", DONGYUN_MRS),
        "최승용" to Player(id = 65, "최승용", PLAYER_TYPE_PITCHER, "두산", SUNGJIN_INSTAZ),
        "김광현" to Player(id = 66, "김광현", PLAYER_TYPE_PITCHER, "SSG", ISAAC_TOASTERZ),
        "한재승" to Player(id = 67, "한재승", PLAYER_TYPE_PITCHER, "NC", YEJIN_PRINCESS),
        "김시훈" to Player(id = 68, "김시훈", PLAYER_TYPE_PITCHER, "NC", DAEHYUN_SPIDERS),
        "김동주" to Player(id = 69, "김동주", PLAYER_TYPE_PITCHER, "두산", TAEMIN_SHINEES),
        "김윤식" to Player(id = 70, "김윤식", PLAYER_TYPE_PITCHER, "LG", DONGJIN_UNIVERSE),
        "임기영" to Player(id = 71, "임기영", PLAYER_TYPE_PITCHER, "KIA", JUHYUNG_DONGHEEMOMS),
        "정우영" to Player(id = 72, "정우영", PLAYER_TYPE_PITCHER, "LG", DONGYUN_MRS),
    )


    //이전 점수 여기에 추가
    var userTotalPointMap = mutableMapOf<Int, Double>(
        SUNGJIN_INSTAZ to 1987.83,
        ISAAC_TOASTERZ to 2863.78,
        YEJIN_PRINCESS to 2207.5,
        DAEHYUN_SPIDERS to 2031.79,
        TAEMIN_SHINEES to 3167.79,
        DONGJIN_UNIVERSE to 1821.62,
        JUHYUNG_DONGHEEMOMS to 2841.62,
        DONGYUN_MRS to 2621.81,
    )

}