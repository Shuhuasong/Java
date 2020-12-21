package test;


import org.w3c.dom.ls.LSOutput;

import java.util.Random;

/*
Two constructor for Random:
 (1) Random random = new Random();
 (2) Random random = new Random(50)
1.不含参构造方法：

public Random() {
    setSeed(System.nanoTime() + seedBase);
    ++seedBase;
}

2.含参构造方法：

public Random(long seed) {
    setSeed(seed);
}

可以看到，不含参构造方法每次都使用当前时间作为种子，而含参构造方法是以一个固定值作为种子
什么是种子 seed 呢？
seed 是 Random 生成随机数时使用的参数：

Random 中最重要的就是 next(int) 方法，使用 seed 进行计算:

protected synchronized int next(int bits) {
    seed = (seed * multiplier + 0xbL) & ((1L << 48) - 1);
    return (int) (seed >>> (48 - bits));
}
*/
public class RandomNumWithSeedTest {

    public static void main(String[] args) {
        System.out.print("Random Without parameter: ");
        for(int i=0; i<5; i++){
            Random random = new Random();
            for(int j=0; j<8; j++){
                System.out.print(" " + random.nextInt(100) + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("Random With parameter: ");
        System.out.println();

        for(int i=0; i<5; i++){
            Random random = new Random(50);
            for(int j=0; j<8; j++){
                System.out.print(" " + random.nextInt(100) + " ");
            }
            System.out.println();
        }
    }
}






















