package SV.TheFirstAid.aid;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class ForStudent {
    //клавіатура
    private ReplyKeyboardMarkup getStudentKeyBoard(){
        //створюємо клавіатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        //створюємо список рядків клавіатури
        List<KeyboardRow> keyboard_Rows = new ArrayList<>();
        //створюємо перший рядок
        KeyboardRow keyboard_Row = new KeyboardRow();
        keyboard_Row.add("Алгоритм розв'язання ситуаційних задач\uD83D\uDCD2");
        //другий рядок
        KeyboardRow keyboard_SecondRow = new KeyboardRow();
        keyboard_SecondRow.add("Оцінка дій рятувальника, який знаходиться на місці події\uD83D\uDCD7");
        //третій рядок
        KeyboardRow keyboard_ThirdRow = new KeyboardRow();
        keyboard_ThirdRow.add("Алгоритм вирішення ситуаційних задач з теми \"СЛР\"\uD83D\uDCD4");
        //четвертий рядок
        KeyboardRow keyboard_FourthRow = new KeyboardRow();
        keyboard_FourthRow.add("Алгоритм вирішення ситуаційних задач з ДМД при відсутності у них ознак смерті\uD83D\uDCD3");
        //п'ятий рядок
        KeyboardRow keyboard_FifthRow = new KeyboardRow();
        keyboard_FifthRow.add("Алгоритм вирішення ситуаційних задач з теми \"Кровотеча\"\uD83D\uDCD5 ");
        //шостий рядок
        KeyboardRow keyboard_SixthRow = new KeyboardRow();
        keyboard_SixthRow.add("Алгоритм вирішення ситуаційних задач з теми \"Травматична ампутація\"\uD83D\uDCD9");
        //сьомий рядок
        KeyboardRow keyboard_SeventhRow = new KeyboardRow();
        keyboard_SeventhRow.add("Алгоритм вирішення ситуаційних задач з теми \"ГДН\"\uD83D\uDCD8");
        //восьмий рядок
        KeyboardRow keyboard_EighthRow = new KeyboardRow();
        keyboard_EighthRow.add("Повернутися⬅");
        //додаємо рядок в список
        keyboard_Rows.add(keyboard_Row);
        keyboard_Rows.add(keyboard_SecondRow);
        keyboard_Rows.add(keyboard_ThirdRow);
        keyboard_Rows.add(keyboard_FourthRow);
        keyboard_Rows.add(keyboard_FifthRow);
        keyboard_Rows.add(keyboard_SixthRow);
        keyboard_Rows.add(keyboard_SeventhRow);
        keyboard_Rows.add(keyboard_EighthRow);
        //встановлюємо цей список нашій клавіатурі
        replyKeyboardMarkup.setKeyboard(keyboard_Rows);
        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup getStudentKeyBoardDemo(){
        return getStudentKeyBoard();
    }
    //алгоритм розв'язання ситуаційних задач
    private String algorithm(){
        String text = "Алгоритм розв'язання ситуаційних задач\uD83D\uDCD2 \n\n";
        text += "\uD83D\uDD38 Крок 1. Переконатися, що немає зовнішньої загрози. \n";
        text += "\uD83D\uDD38 Крок 2. Провести дії самозахисту( вдягнути рукавички, маску, окуляри).\n";
        text += "\uD83D\uDD38 Крок 3. Перевірити чи проведено первинний огляд. Якщо проведено - які його результати?\n ";
        text += "\uD83D\uDD38 Крок 4. Перевірити чи проведено вторинний огляд. Його результати?\n";
        text += "\uD83D\uDD38 Крок 5. Проаналізувати симптоми відповідно до задачі. Визначити та обґрунтувати діагноз. \n";
        text += "\uD83D\uDD38 Крок 6. Чи треба якій додаткові обстеження для діагнозу(опитування,огляд).\n";
        text += "\uD83D\uDD38 Крок 7. Послідовність дій ДМД, в тому числі особливості імобілізації, або імобілізація вкладанням. \n";
        text += "\uD83D\uDD38 Крок 8. Чи є/можуть виникнути ускладнення у постраждалого. \n";
        text += "\uD83D\uDD38 Крок 9. Що робити для їх попередження?\n";
        text += "\uD83D\uDD38 Крок 10. Дії під час очікування швидкої?\uD83D\uDE91 \n";
        return text;
    }

    public String algorithmDemo(){
        return algorithm();
    }
    //оцінка дій рятувальника
    private String actionEvaluation(){
        String text = "Оцінка дій рятувальника, який знаходиться на місці події\uD83D\uDCD7\n\n";
        text += "\uD83D\uDD38 Крок 1. Визначити чи існує зовнішня загроза(вибух,пожежа,наїзд машини, транспортні події тощо) Якщо є, сформувати необхідні дії з попередження загрози \n";
        text += "\uD83D\uDD38 Крок 2. Визначити чи потрібні Вам помічники. Якщо потрібні - визначити їхню кількість та сформувати обсяг їхніх дій\n";
        text += "\uD83D\uDD38 Крок 3. Визначити чи проведено первинний огляд (свідомість, дихання, пульс) потерпілого. Якщо ні - сформулюйте характер дій первинного огляду\n ";
        text += "\uD83D\uDD38 Крок 4. Дати оцінку результатів первинного огляду\n";
        text += "\uD83D\uDD39 Свідомість збережена, відповідає на запитання \n";
        text += "\uD83D\uDD39 Відсутність свідомості при наявності дихання і пульсу\n";
        text += "\uD83D\uDD39 Відсутність свідомості, дихання і пульсу \n";
        return text;
    }

    public String actionEvaluationDemo(){
        return actionEvaluation();
    }

    //алгоритм СЛР
    private String algorithmCPR(){
        String text = "Алгоритм вирішення ситуаційних задач з теми \"СЛР\"\uD83D\uDCD4\n\n";
        text += "\uD83D\uDD38 Крок 1. Провести первинний огляд. Якщо в потерпілого немає свідомості, дихання, пульсу та є ознаки біологічної смерті - реанімація неможлива. Якщо ознак біологічної смерті немає - приступити до СЛР \n";
        text += "\uD83D\uDD38 Крок 2. Вказати послідовність дій СЛР у дітей або у дорослої людини\n";
        text += "\uD83D\uDD38 Крок 3. Вказати положення постраждалого для проведення СЛР\n ";
        text += "\uD83D\uDD38 Крок 4. Обгрунтувати з чого починати СЛР:штучна вентиляція легень(ШВЛ) чи непрямий масаж серця.\n";
        text += "\uD83D\uDD38 Крок 5. Вказати послідовність дій для забезпечення прохідності дихальних шляхів і проведення непрямого масажу серця\n";
        text += "\uD83D\uDD38 Крок 6. Вказати термін контролю появи ознак життя внаслідок проведення СЛР\n";
        text += "\uD83D\uDD38 Крок 7. Описати послідовність дій при проведення дефібриляції \n";
        text += "\uD83D\uDD38 Крок 8. Вказати загальну тривалість проведення СЛР \n";
        return text;
    }

    public String algorithmCPRDemo(){
        return algorithmCPR();
    }

    //алгоритм при відсутності ознак смерті

    private String algorithmWithoutSignOfDeath(){
        String text = "Алгоритм вирішення ситуаційних задач з ДМД при відсутності у них ознак смерті\uD83D\uDCD3 \n\n";
        text += "\uD83D\uDD39 Відсутність свідомості при наявності дихання і пульсу: \n";
        text += "\uD83D\uDD38 Непритомність(зомління) - обгрунтувати послідовність дій ДМД\n";
        text += "\uD83D\uDD38 Кома - обгрунтувати небезпечні наслідки даного стану та сформувати дії ДМД\n ";
        text += "\uD83D\uDD39 Свідомість збережена. Відповідає на запитання.\n";
        text += "\uD83D\uDD38 Крок 1. Визначити чи за умовами задачі було проведено вторинний огляд постраждалого. Якщо так, але у неповному обсязі - які дії вторинного огляду необхідно провести в даній ситуації?\n";
        text += "\uD83D\uDD38 Крок 2. Проаналізувати симптоми постраждалого і сформулювати характер уражень та їх ускладнення.\n";
        text += "\uD83D\uDD38 Крок 3. Визначити послідовність дій ДМД відповідно до основного ураження та ускладнення \n";
        text += "\uD83D\uDD38 Крок 4. Вказати заборонні дії допомоги \n";
        text += "\uD83D\uDD38 Крок 5. Встановити сортувальну групу постраждалого\n";
        text += "\uD83D\uDD38 Крок 6. Визначити, в якому положенні та в яку чергу необхідно транспортувати постраждалого до лікувального закладу \n";
        text += "\uD83D\uDD38 Крок 7. Описати дії моніторингу за постраждалим до приїзду швидкої медичної допомоги \n";
        return text;
    }

    public String algorithmWithoutSignOfDeathDemo(){
        return algorithmWithoutSignOfDeath();
    }

    private String algorithmBleeding(){
        String text = "Алгоритм вирішення ситуаційних задач з теми \"Кровотеча\"\uD83D\uDCD5 \n\n";
        text += "\uD83D\uDD38 Крок 1. Встановити різновид кровотечі, навести докази. \n";
        text += "\uD83D\uDD39 Критична зовнішня кровотеча з кінцівки:\n";
        text += "\uD83D\uDD38 Крок 2. Визначити послідовність наступних дій в залежності від наявності медичних засобів\n ";
        text += "\uD83D\uDD38 Крок 3. Визначити місце накладання джгута, закрутки. Обгрунтувати\n";
        text += "\uD83D\uDD38 Крок 4. Перевірити, що джгут накладено правильно\n";
        text += "\uD83D\uDD38 Крок 5. Заборонні дії при накладанні джгута, турнікету, закрутки\n";
        text += "\uD83D\uDD38 Крок 6. Подальші дії\n";
        text += "\uD83D\uDD38 Крок 7. Визначити чи в постраждалого є ознаки геморагічного шоку(назвати їх) \n";
        text += "\uD83D\uDD38 Крок 8. Послідовність дій домедичної допомоги для попередження або зупинки прогресування геморагічного шоку\n";
        text += "\uD83D\uDD39 Вузлова кровотеча \n";
        text += "\uD83D\uDD39 Некритична кровотеча з кінцівки \n";
        text += "\uD83D\uDD39 Зовнішня кровотеча із внутрішніх органів \n";
        text += "\uD83D\uDD38 Крок 2. Визначити послідовність дій по зупинці вузлової кровотечі у постраждалого \n";
        text += "\uD83D\uDD38 Крок 3. Визначити чи в постраждалого є ознаки геморагічного шоку(назвати їх) \n";
        text += "\uD83D\uDD38 Крок 4. Послідовність дій домедичної допомоги для попередження або зупинки прогресування геморагічного шоку \n";
        text += "\uD83D\uDD39 Внутрішня кровотеча \n";
        text += "\uD83D\uDD38 Крок 2. Вказати звідки кровотеча \n";
        text += "\uD83D\uDD38 Крок 3.  Визначити послідовність дій по зупинці вузлової кровотечі у постраждалого\n";
        text += "\uD83D\uDD38 Крок 4.  Визначити чи в постраждалого є ознаки геморагічного шоку(назвати їх)\n";
        text += "\uD83D\uDD38 Крок 5. Послідовність дій домедичної допомоги для попередження або зупинки прогресування геморагічного шоку\n";
        return text;
    }
    public String algorithmBleedingDemo(){
        return algorithmBleeding();
    }

    private String algorithmAmputation(){
        String text = "Алгоритм вирішення ситуаційних задач з теми \"Травматична ампутація\"\uD83D\uDCD9 \n\n";
        text += "\uD83D\uDD38 Крок 1.Скласти послідовність наступних дій рятівника стосовно травмованої частини кінцівки в залежності від рівня ампутації або ампутованої кінцівки \n";
        text += "\uD83D\uDD38 Крок 2. Вказати послідовність протишокових засобів\n";
        text += "\uD83D\uDD38 Крок 3. Встановити сортувальну групу постраждалого\n ";
        text += "\uD83D\uDD38 Крок 4. З чого складається моніторинг за постраждалим до приїзду медичної допомоги\n";
        return text;
    }

    public String  algorithmAmputationDemo(){
        return algorithmAmputation();
    }

    private String algorithmARF(){
        String text = "Алгоритм вирішення ситуаційних задач з теми \"ГДН\"\uD83D\uDCD8 \n\n";
        text += "\uD83D\uDD38 Крок 1. Визначити причину ГДН за умовами задачі \n";
        text += "\uD83D\uDD39 Обтурація дихальних шляхів\n";
        text += "\uD83D\uDD38 Крок 2. Визначити, що порушує прохідність дихальних шляхів:\n ";
        text += "\uD83D\uDD38 - стороннє тіло;\n ";
        text += "\uD83D\uDD38 - накопичення патологічного секрету, води, крові;\n ";
        text += "\uD83D\uDD38 - набряк гортані;\n ";
        text += "\uD83D\uDD38 - травма шиї, грудної клітки;\n ";
        text += "\uD83D\uDD38 Крок 3. Визначити послідовність дій, в залежності від причини, що порушує прохідність дихальних шляхів\n";
        text += "\uD83D\uDD38 - визначити послідовність дій при проведенні прийому Хеймліха;\n ";
        text += "\uD83D\uDD38 - визначити послідовність дій при проведенні пальцевої ревізії, порожнини рота і ротоглотки;\n ";
        text += "\uD83D\uDD38 - визначити послідовність дій при введенні носогорлової трубки;\n ";
        text += "\uD83D\uDD39 Зовнішні причини ГДН:\n";
        text += "\uD83D\uDD38 - отруєння чадним газом;\n ";
        text += "\uD83D\uDD38 - інгаляційне отруєння промисловими газами;\n ";
        text += "\uD83D\uDD38 - нестача кисню в повітрі;\n ";
        text += "\uD83D\uDD38 Крок 2. Визначити послідовність дій, в залежності від причини, що порушує прохідність дихальних шляхів;\n ";
        return text;
    }

    public String algorithmARFDemo(){
        return algorithmARF();
    }
}
