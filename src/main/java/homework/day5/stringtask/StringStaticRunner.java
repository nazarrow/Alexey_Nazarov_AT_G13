package main.java.homework.day5.stringtask;

public class StringStaticRunner {
    public static void main(String[] args) {
        OneLettersInColumnStatic.letInCol("Letters");

        TwoDuplicateWordsStatic.duplicateWords("DupWords ne DupWords DupWords 123 ne ne ne");

        ThreeFindAllDigitsStatic.findAllDigits("23 sdjfhsjdf 36346 skdfjsdj 345hkjgkgk345k3h4g5h34 ! sdf 4");

        FourOutputUniqueIpStatic.outputListUniqueIp("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied");

        FiveCurrentDateTimeStatic.curDateTime();

        SixDateTimeFormatStatic.formatDateTime("22.00 07.09.2020");

        SevenGeneratedVowelDateStatic.printVowelDate("та самая дата");
    }
}
