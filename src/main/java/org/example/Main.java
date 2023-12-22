package org.example;

import org.example.patternMatch.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(パターンマッチするよ(new にほんご()));
        System.out.println(パターンマッチするよ(new にぽんご()));
        System.out.println(パターンマッチするよ(new じゃぽーね("a", 1)));
        System.out.println(パターンマッチするよ(new じゃぽーね2("b", 2, 3)));
    }

    static String パターンマッチするよ(日本語パターンマッチ ぱたーんにまっちしそうななにか) {
        return switch (ぱたーんにまっちしそうななにか) { // switch式の方だよ
            case じゃぽーね2(String str, int int1, int int2) -> "じゃぽーね２だよ"; // レコードもつかえるよ
            case にほんご a -> "にほんごだよ";
            case にぽんご a -> "にぽぽぽんごだよ";
            case じゃぽーね(String str, int int1) -> "じゃぽーねだよ";
            // どれかをコメントアウトすると「エラー: switch式がすべての可能な入力値をカバーしていません」のコンパイルエラーがでる。コンパイル時だ！わーい！！
        };
    }
}