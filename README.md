## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
---
## 기능 시나리오
    1. Source를 실행한다.
    2. 컴퓨터는 1~9 사이의 중복되지 않는 한 자리 숫자 3개를 선정한다.
    3. 사용자가 Console에 1자리 숫자 3개를 입력한다.
        * 입력 시 유의사항 적기
    4. 사용자가 입력한 숫자 3자리와 컴퓨터가 선정한 숫자 3자리가 일치하는지 확인한다.
    5. 숫자와 자릿수가 일치하면 일치한 갯수 만큼 Strike를 Console에 출력한다.
    6. 숫자는 일치하지만 자랏수가 일치하지 않으면 그 숫자만큼 Ball을 Console에 출력한다.
    7. 숫자가 하나도 일치하지 않으면 4Ball/Nothing을 Console에 출력한다.
    8. 3Strike가 나오면 게임 종료 메시지를 Console에 출력한다.
    9. 게임을 계속 진행할지 Console에 출력한다.
    10. 사용자가 게임을 계속 진행하고자 하는 경우 (2)번 항목부터 다시 시작한다.
    11. 사용자가 게임을 계속 진행하지 않는 경우 Source 실행을 종료한다.

## 필요한 기능 목록
    1. 컴퓨터가 1~9 사이의 중복되지 않는 한 자리 숫자 3개를 선정하는 기능
    2. 컴퓨터가 선정한 숫자 3개가 중복되지 않는지 체크
    3. 야구 게임이 시작되었다는 메시지 출력 기능
    4. 사용자로부터 값을 입력하라는 메시지 출력 기능
    5. 사용자가 Console에 입력할 수 있는 기능
    6. 사용자가 입력한 숫자 3개가 1~9 사이의 숫자인지 체크
    7. 사용자가 입력한 숫자 3개가 중복되지 않는지 체크
        * (2)의 기능 사용
    8. 사용자가 입력한 숫자 3개가 컴퓨터가 선정한 숫자에 존재하는지 체크
    9. Ball 갯수 체크 기능
    10. Strike 갯수 체크 기능
    11. 하나라도 존재하는 경우 Ball / Strike 갯수를 메시지로 출력하는 기능
        * Strike과 Ball이 모두 존재하면 nStrike mBall 출력
        * Strike만 존재한다면 nStrike 출력
        * Ball만 존재한다면 mBall 출력
    12. 하나라도 존재하지 않는 경우 4Ball/Nothing 메시지 출력 기능
    13. 3Strike인 경우 게임이 종료되었다는 메시지 출력 기능
    14. 게임을 계속 진행할지 선택하는 메시지 출력 기능
    15. 사용자로부터 게임을 계속 진행할 것인지 선택하는 기능
    16. 사용자가 게임을 계속 진행한다고 선택한 경우 (2)부터 다시 시작
    17. 사용자가 게임을 계속 진행하지 않겠다고 선택한 경우 게임 종료