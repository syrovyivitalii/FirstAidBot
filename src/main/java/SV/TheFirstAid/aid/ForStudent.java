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
        keyboard_Row.add("Повернутися⬅");
        //додаємо рядок в список
        keyboard_Rows.add(keyboard_Row);
        //встановлюємо цей список нашій клавіатурі
        replyKeyboardMarkup.setKeyboard(keyboard_Rows);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup getStudentKeyBoardDemo(){
        return getStudentKeyBoard();
    }

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
}

