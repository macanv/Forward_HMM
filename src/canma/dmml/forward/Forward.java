package canma.dmml.forward;

/**
 * Created by macan on 2016/12/7.
 */
public class Forward {
    /**
     * ����ÿһ���ļ�����
     */
    private double[][] alpha;

    /**
     * ת�Ƹ���
     */
    private double[][] A;

    /**
     * ת������
     */
    private double[][] B;

    /**
     * ��ʼ״̬����
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
     * ���Ƽ���ǰ�����
     */
    public void calcForward(int[] observer){
        //��ȡ������
        int time = A.length;
        //��ȡ
        int count = pi.length;

        for (int i = 0; i < )
    }
}
