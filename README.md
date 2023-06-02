## Лабораторная работа по devOps №1
1. Консольное приложение калькулятор на Java.
2. Юнит тесты с помощью фреймворков junit и assertj.
3. Настроена система сборки и установлены необходимые зависимости.
4. Создан простой пайплайн сборки в GitHub Actions [(тестирование, сборка,  выгрузка)](https://docs.github.com/ru/actions/automating-builds-and-tests/building-and-testing-java-with-maven).
5. Добавлена выгрузка готового артефакта после успешной сборки (package.zip).
6. Добавлена [выгрузка](https://github.com/marketplace/actions/google-drive-upload-git-action) каждой версии на [google drive](https://drive.google.com/drive/folders/1haUNLZMJRnHAfNcGQKYqLNkWySiYTFwB?usp=sharing).
7. Добавлен [статический анализ кода](https://github.com/marketplace/actions/lint-action).
8. Автоматическая сборка, тестирование и выгрузка происходят при каждом пуше в репозиторий или создании Pull Request. Анализ кода происходит только при пуше или создании Pull Request в ветку master. 
9. Версия системы - ubuntu-latest
