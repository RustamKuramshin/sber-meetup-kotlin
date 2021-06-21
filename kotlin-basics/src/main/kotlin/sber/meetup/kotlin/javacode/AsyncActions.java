// Java
// НЕТ ПРЯМОГО АНАЛОГА
package sber.meetup.kotlin.javacode;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class AsyncActions {

    public static Mono<Integer> getData() {
        return Mono.just(1);
    }

    public static Flux<Integer> iterListAsync(List<Integer> integerList) {
        return Flux.fromIterable(integerList)
                .map(i -> i * 2)
                .filter(i -> i > 10)
                .flatMap(i -> getData());
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);

        iterListAsync(integerList).subscribe(System.out::println);
    }
}
