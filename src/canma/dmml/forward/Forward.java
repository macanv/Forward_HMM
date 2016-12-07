package canma.dmml.forward;

/**
 * Created by macan on 2016/12/7.
 */
public class Forward {
    /**
     * 保存每一步的计算结果
     */
    private double[][] alpha;

    /**
     * 转移概率
     */
    private double[][] A;

    /**
     * 转换概率
     */
    private double[][] B;

    /**
     * 初始状态概率
     */
    private double[] pi;


    public Forward(double[][] A, double[][] B, double[] pi, int[] observer){
        this.A = A;
        this.B = B;
        this.pi = pi;
        alpha = new double[A.length][pi.length];

        calcForward(observer);
    }

    /**
     * 递推计算前向概率
     */
    public void calcForward(int[] observer){
        //获取序列数
        int time = A.length;
        //获取
        int count = pi.length;

        for (int i = 0; i < )
    }
}
