package SV.TheFirstAid.aid;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Services {
    //головне меню
    private ReplyKeyboardMarkup getMenuKeyBoard(){
        //Створюємо клавіатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        //створюємо список рядків
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        //створюємо перший рядок
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add("Серцево-легенева реанімація\uD83E\uDEC0\uD83E\uDEC1️");
        keyboardRow.add("Кровотеча\uD83E\uDE78");
        //створюємо другий рядок кнопок
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("Опіки/Обмороження⛑");
        keyboardSecondRow.add("Вогневе поранення\uD83D\uDD2B");
        //створюємо третій рядок кнопок
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add("Черепно-мозкова травма\uD83E\uDDE0");
        keyboardThirdRow.add("Травми кісток\uD83E\uDDB4");
        //створюємо четвертий рядок
        KeyboardRow keyboardFourthRow = new KeyboardRow();
        keyboardFourthRow.add("Інструкція користувача\uD83D\uDCC4");
        //додаємо всі рядки в список
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardSecondRow);
        keyboardRows.add(keyboardThirdRow);
        keyboardRows.add(keyboardFourthRow);
        //встановлюємо цей список нашій клавіатурі
        replyKeyboardMarkup.setKeyboard(keyboardRows);
        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup getMenuKeyBoardDemo(){
        return  getMenuKeyBoard();
    }

    //інструкція користувача
    private String instruction(){
        String text = "Інструкція користувача\uD83D\uDCC4 \n\n ";
        text += "\uD83D\uDD39 Про БОТ: \n";
        text += "\uD83D\uDD38 створений для допомоги громадянам в наданні ПЕРШОЇ ДОМЕДИЧНОЇ ДОПОМОГИ; \n";
        text += "\uD83D\uDD38 детальне, структуроване викладення матеріалу; \n";
        text += "\uD83D\uDD38 бот вчиться разом з вами - щоденне оновлення інформації; \n\n";
        text += "\uD83D\uDD39 Взаємодія з БОТом: \n";
        text += "\uD83D\uDD38 у меню оберіть стан постраждалого, щоб отримати інструкцію з надання ДМД; \n";
        text += "\uD83D\uDD38 для повернення до головного меню оберіть пункт \"Повернутися⬅ \" \n\n";
        text += "\uD83D\uDD39 Розробник:\n ";
        text += "\uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBB Здобувач освітньої програми \"Комп'ютерні науки\" Львівського ДУ БЖД Віталій СИРОВИЙ \n\n  ";
        text += "\uD83D\uDD39 Ментори: \n";
        text += "\uD83E\uDDD1\uD83C\uDFFC\u200D\uD83D\uDCBB К.т.н, доцент кафедри інформаційних технологій та телекомунікаційних систем Львівського ДУ БЖД Олександр ПРИДАТКО\n ";
        text += "\uD83E\uDDD1\u200D⚕️ К.м.н, доцент кафедри Львівського ДУ БЖД Галина ТЕЛЕГІНА\n\n ";
        text += "\uD83D\uDCDE Контакти:\n ";
        text += "Є ідеї щодо покращення роботи БОТа або помітили помилку в його роботі? Пишіть нам на пошту: \n ";
        text += "syrovyivitalii@gmail.com \n";
        return text;
    }
    public String instructionDemo(){
        return instruction();
    }

}
