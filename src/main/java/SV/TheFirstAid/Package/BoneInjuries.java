package SV.TheFirstAid.Package;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

//клавіатура
public class BoneInjuries {
    private ReplyKeyboardMarkup getBoneInjuriesKeyBoard(){
        //Створюємо клавіатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        //створюємо список рядків
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        //створюємо перший рядок
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add("\uD83D\uDD39Відкритий перелом");
        keyboardRow.add("\uD83D\uDD39Закритий перелом");
        //створюємо другий рядок
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("\uD83D\uDD39Вивих");
        keyboardSecondRow.add("Повернутися⬅");
        //додаємо рядки в список
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardSecondRow);
        //встановлюємо цей список нашій клавіатурі
        replyKeyboardMarkup.setKeyboard(keyboardRows);
        return replyKeyboardMarkup;
    }
    ReplyKeyboardMarkup getBoneInjuriesKeyBoardDemo(){
        return getBoneInjuriesKeyBoard();
    }
    //перелом кістки
    private String boneInjuries(){
        return  "Оберіть вид травми ⛑ ";
    }
    String boneInjuriesDemo(){
        return boneInjuries();
    }

    //відкритий перелом
    private String openFracture(){
        String text = "⛑ Відкрити перелом - часткове або повне порушення цілістності кістки з одночасним пошкодженням шкірних покровів.\n\n ";
        text +="Домедична допомога: \n";
        text +="\uD83D\uDD38 Крок 1. Викликати бригаду екстреної (швидкої) медичної допомоги. \n";
        text +="\uD83D\uDD38 Крок 2. Розрізати одяг над раною.\n";
        text +="\uD83D\uDD38 Крок 3. Накласти стерильну, чисту пов'язку на рану.\n";
        text +="\uD83D\uDD38 Крок 4. Допомогти постраждалому приняти зручне положення(таке, яке завдає найменше болю).\n";
        text +="\uD83D\uDD38 Крок 5. Знерухомити пошкоджену кінцівку за допомогою стандартного обладнання(шин) чи підручних засобів.\n";
        text +="\uD83D\uDD38 Крок 6. Вкрити постраждалого термопокривалом/покривалом.\n";
        text +="\uD83D\uDD38 Крок 7. Забезпечити постійних нагляд за постраждалим до прибуття бригади екстреної (швидкої) медичної допомоги.\n";
        return text;
    }
    String openFractureDemo(){
        return openFracture();
    }

    //закрити перелом
    private String closedFracture(){
        String text = "⛑ Закритий перелом - часткове або повне порушення цілістності кістки без порушення шкірних покровів. ";
        text +="Домедична допомога: \n";
        text +="\uD83D\uDD38 Крок 1. Викликати бригаду екстреної (швидкої) медичної допомоги. \n";
        text +="\uD83D\uDD38 Крок 2. Допомогти постраждалому приняти зручне положення(таке, яке завдає найменше болю).\n";
        text +="\uD83D\uDD38 Крок 3. Знерухомити пошкоджену кінцівку за допомогою стандартного обладнання(шин) чи підручних засобів.\n";
        text +="\uD83D\uDD38 Крок 4. Вкрити постраждалого термопокривалом/покривалом.\n";
        text +="\uD83D\uDD38 Крок 5. Забезпечити постійних нагляд за постраждалим до прибуття бригади екстреної (швидкої) медичної допомоги.\n";
        return text;
    }
    String closedFractureDemo(){
        return closedFracture();
    }

    //вивих
    private String dislocation(){
        String text = "⛑ Травматичне пошкодження суглоба, унаслідок якого поверхні кісток зміщуються або повністю втрачають дотикання, а суглобова сумка розривається.\n\n ";
        text +="\uD83D\uDD39 Ознаки: \n";
        text +="- біль в кінцівці; \n";
        text +="- відсутність активних і неможливість пасивних рухів у суглобі;\n";
        text +="- опір при спробі зробити рух в суглобі; \n";
        text +="- деформація ділянки суглоба; \n";
        text +="- зміна довжини кінцівки; \n";
        text +="Домедична допомога: \n";
        text +="\uD83D\uDD38 Крок 1. Викликати бригаду екстреної (швидкої) медичної допомоги. \n";
        text +="\uD83D\uDD38 Крок 2. Зафіксувати кінцівку в тому положенні, яке вона прийняла після вивиху.\n";
        text +="\uD83D\uDD38 Верхню кінцівку підвішують на косинці.\n";
        text +="\uD83D\uDD38 Нижню кінцівку знерухомлюють за допомогою шин або підручних засобів.\n";
        text +="\uD83D\uDD38 УВАГА❗ Ні в якому разі не вправляйте вивихнуту кінцівку! Це може зробити лише лікар-травматолог!\n";
        return text;
    }
    String dislocationDemo(){
        return dislocation();
    }
}
