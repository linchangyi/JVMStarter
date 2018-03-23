package ch03;

/**
 * @author LinChangyi
 * @date 2018/3/23
 **/
public class CH03_07 {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms40M -Xmx40M -Xmn20M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
     * -XX:+PrintTenuringDistribution
     */
    @SuppressWarnings("unused")
    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];  // 什么时候进入老年代决定于XX:MaxTenuringThreshold设置
        allocation2 = new byte[8 * _1MB];
        allocation3 = new byte[8 * _1MB];
        allocation3 = null;
        allocation3 = new byte[8 * _1MB];
    }

    public static void main(String[] args) {
        testTenuringThreshold();
    }
}
