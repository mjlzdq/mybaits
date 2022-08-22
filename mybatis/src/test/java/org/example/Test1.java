package org.example;

import org.testng.annotations.Test;

public class Test1 {
    @Test
    public static void add(){
        System.out.println("ceshi");
    }
    /**
     * @BeforeSuite：在此套件中的所有测试运行之前，将运行带注释的方法。
     *
     * @AfterSuite：在此套件中的所有测试运行后，将运行带注释的方法。
     *
     * @BeforeTest：在运行属于标记内的类的任何测试方法之前，将运行带注释的方法。
     *
     * @AfterTest：在标记内的类的所有测试方法都运行之后，将运行带注释的方法。
     *
     * @BeforeGroups：此配置方法之前将运行的组列表。保证在调用属于任何这些组的第一个测试方法之前不久运行此方法。
     *
     * @AfterGroups：此配置方法将在之后运行的组列表。保证在调用属于任何这些组的最后一个测试方法后不久运行此方法。
     *
     * @BeforeClass：在调用当前类中的第一个测试方法之前，将运行带注释的方法。
     *
     * @AfterClass：在运行当前类中的所有测试方法之后，将运行带注释的方法。
     *
     * @BeforeMethod：带注释的方法将在每个测试方法之前运行。
     *
     * @AfterMethod：带注释的方法将在每个测试方法之后运行。
     *
     * @Test：带注释的方法是测试用例的一部分。
     *
     */

    /**
     * assertTrue：判断是否为True。
     *
     * assertFalse：判断是否为false。
     *
     * assertSame：判断引用地址是否相同。
     *
     * assertNotSame：判断引用地址是否不相同。
     *
     * assertNull：判断是否为null。
     *
     * assertNotNull：判断是否不为null。
     *
     * assertEquals：判断是否相等，Object类型的对象需要实现haseCode及equals方法。
     *
     * assertNotEquals：判断是否不相等。
     *
     * assertEqualsNoOrder：判断忽略顺序是否相等。
     *
     */


}
