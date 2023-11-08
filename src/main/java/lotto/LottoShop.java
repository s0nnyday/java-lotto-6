package lotto;

import lotto.Lotto;
import lotto.LottoTicket;

import java.util.ArrayList;
import java.util.List;

public class LottoShop {
    public static final int LOTTO_PRICE = 1000;

    public LottoTicket buyLottoTicket(int amount) {

        int numOfTickets = amount / LOTTO_PRICE;
        List<Lotto> tickets = new ArrayList<>();

        for (int i = 0; i < numOfTickets; i++) {
            Lotto lotto = Lotto.createRandomNumber();
            tickets.add(lotto);
        }

        return new LottoTicket(tickets);
    }
}
