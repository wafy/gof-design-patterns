package singleton;

public class Settings {

    /**
     * new를 사용해서 외부에서 객체를 생성하지 못한다.
     */
    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }


    /**
     * 두가지 쓰레드가 동시에 if문을 접근하면 쓰레드가 두개 생성되는 문제점.
     * 1. synchronized : 동기화 메커니즘 때문에 lock 발생 때문에 성능에 문제가 발생한다.
     * 2. 이른 초기화(eager initialization) 사용하기
     * - 미리 만드는게 단점
     * - 객체 생성단계가 오래 걸리는데 만들어 놓고 사용하지 않는다면 비효율
     * 3. 더블 체크드 락킹 사용하기
     * - 동시에 쓰레드가 접근하더래도 if문 안에서 동기화를 처리하기 때문에 메서드에 걸리는것보다 성능의 유리
     * - 인스턴스가필요한 시점에 생성하는점
     * - jdk 1.5부터 동작함
     * 4. static inner 클래스 사용하기
     * - 권고하는 방법중 하나
     */

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
