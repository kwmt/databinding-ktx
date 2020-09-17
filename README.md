# 

## 現象
`AndroidLibraryDataBindingKtx`で`mylibrary`モジュールを作成
`mylibrary`は `https://github.com/wada811/DataBinding-ktx`に依存している。

`MyApplication`プロジェクトで `mylibrary`をdependenciesに追加してビルドすると以下のエラーが出る。

```
Could not find com.github.wada811:DataBinding-ktx:5.0.0.
Searched in the following locations:
  - https://dl.google.com/dl/android/maven2/com/github/wada811/DataBinding-ktx/5.0.0/DataBinding-ktx-5.0.0.pom
  - https://jcenter.bintray.com/com/github/wada811/DataBinding-ktx/5.0.0/DataBinding-ktx-5.0.0.pom
  - file:/Users/kwmt/.m2/repository/com/github/wada811/DataBinding-ktx/5.0.0/DataBinding-ktx-5.0.0.pom
Required by:
    project :app > net.kwmt27.mylibrary:databinding-ktx:1.0
```

## 再現方法

1. `AndroidLibraryDataBindingKtx`で下記のタスクを実行
```
mylibrary/Tasks/publishing/publishToMavenLocal
```

2. `MyApplication`でビルドを実行



