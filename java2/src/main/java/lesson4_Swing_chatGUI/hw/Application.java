package lesson4_Swing_chatGUI.hw;

/**
 * 1. Создать окно для клиентской части чата: большое текстовое поле для отображения
 * переписки в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка
 * для отсылки сообщений на нижней панели. Сообщение должно отсылаться либо по
 * нажатию кнопки на форме, либо по нажатию кнопки Enter. При «отсылке» сообщение
 * перекидывается из нижнего поля в центральное.
 */

public class Application {

    public static void main(String[] args) {

        new ClientFrame();
    }
}
