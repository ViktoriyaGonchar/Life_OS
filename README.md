# 🏠 LifeOS: My Digital Life

Мобильная игра для Android 10-14, разработанная на Kotlin с использованием Jetpack Compose и современной архитектуры Clean Architecture + MVVM/MVI.

## 📱 Описание

**LifeOS: My Digital Life** — это единая, живая вселенная, где игрок управляет виртуальным персонажем, чья жизнь включает работу, отдых, уход за питомцем, строительство замка, рыбалку, рейды и даже AR-приключения на отдельных экранах-локациях. Всё это — органичные части одного мира.

## 🎨 Визуальный стиль

### Пиксельная эстетика + эмодзи-язык

- Все заголовки, кнопки, описания — с эмодзи для мгновенного восприятия:
  - 🏠 Дом
  - 🥩 Голод: 85%
  - 💰 $1,240
  - 🐉 Питомец: Дракончик
  - ⚔️ Рейд через: 02:14

### Цветовая палитра

- **Светлая тема** — пастельные тона с градиентом (мягкий бирюзовый, тёплый оранж, нежно-розовый), не напрягающие зрение, с четкими шрифтами и черными надписями
- **Тёмная тема** — тёмно-синие и фиолетовые оттенки с неоновыми акцентами
- Переключение тем — с сохранением в DataStore

## 🌍 Игровой мир

Игрок живёт в ускоренном 24-часовом цикле. В зависимости от времени суток, профессии и выбора, он может:

- 🌅 **Утром** пойти на рыбалку → мини-игра **Fishing Clash**
- ☀️ **Днём** работать поваром → **Cooking Dash**
- 🌆 **Вечером** ухаживать за питомцем → получай уведомления
- 🌙 **Ночью** участвовать в рейде → **Raid Boss**
- 🏰 В любое время — улучшать свой **замок**
- 🤝 Посещать «соседей»: поливай их ферму, убирай мусор, воруй яйца
- 📸 Раз в неделю — выходи в **AR-квест**
- 🛏️ А в снах — проходить короткие **пиксельные головоломки**

## 🎮 Полный список локаций

### Основные локации

1. **🍪 Секретная печенька** — Cookie Clicker Clone
2. **💤 Сны персонажа** — 2D Platformer
3. **🏃 Бег от налогов** — Endless Runner
4. **📖 Книга судеб** — Text-Based Adventure RPG
5. **⭐ Магическая шкатулка** — Match-3 Puzzle
6. **⭕ Игра в парке** — Online Tic-Tac-Toe
7. **🏘️ Мой район** — Isometric City Builder
8. **🎯 Арена снов** — 3D FPS Arena
9. **🧙 Подземелье под домом** — Open World Quest RPG
10. **⚔️ Клановые войны** — Multiplayer Battle Arena
11. **📸 Охота за артефактами** — AR Treasure Hunt
12. **🐉 Мой питомец** — Цифровой террариум
13. **🌾 Ферма за домом** — Idle Farm
14. **🎵 Музыкальная комната** — Rhythm Tap
15. **🧩 Лабиринт разума** — Procedural Maze
16. **🤝 Дом с друзьями** — Кооперативная головоломка
17. **🧱 Реставрация дома** — Demolition Sandbox
18. **🌑 Ночной патруль** — Top-Down Stealth
19. **🌸 Сад на балконе** — Eco Sim
20. **🛋️ Украшение комнаты** — Merge & Build
21. **🏠 Мой день** — Life Sim (ядро игры)

## 🔧 Технические требования

### Технологии

- **Язык**: Kotlin (100%, без Java)
- **UI**: Jetpack Compose + Material 3
- **Минимальная версия Android**: 10 (API 29)
- **Целевая версия Android**: 14 (API 36)

### Архитектура

- **Clean Architecture** (слои `:core`, `:domain`, `:data`, `:presentation`)
- **Модульность**: каждый игровой режим — отдельный Gradle-модуль
- **MVVM/MVI** паттерн для управления состоянием

### Хранение данных

- **Room Database** — для прогресса, предметов, квестов
- **DataStore** — для настроек, темы, feature flags

### Фоновые задачи

- **WorkManager** — для расчёта времени и пассивного дохода при закрытом приложении
- **Foreground Service + Notification** — напоминания о питомце, рейдах, урожае

### Графика

- Пиксельные спрайты в `/drawable` или через Compose Image
- Анимации — через Compose Animation API или Lottie

### Сетевые возможности

- Локальные «соседи» — боты (без обязательного интернета)
- Онлайн-режим (опционально) — через Firebase (заглушка)

## 🧪 Тестирование

- **Unit-тесты** — JUnit, MockK
- **UI-тесты** — Espresso Compose
- Все скрытые функции покрыты тестами и отключаемы через feature flags

## 🎯 Скрытые механики

- Нажми 10 раз на питомца → откроется 🎩 секретная шляпа
- В 3:33 ночи появится 🧙‍♂️ NPC-алхимик с уникальным квестом
- Введи код `LIFEOS2025` в профиле → получи $10,000

## ♿ Доступность

- Поддержка увеличенного шрифта
- Контрастность для тёмной темы
- Навигация без тактильных жестов

## 📦 Установка

1. Клонируйте репозиторий:
```bash
git clone https://github.com/yourusername/Life_OS.git
```

2. Откройте проект в Android Studio

3. Синхронизируйте Gradle зависимости

4. Запустите приложение на эмуляторе или устройстве

## 🎨 Дизайн-система

### Визуальная концепция

**LifeOS** использует уникальный визуальный стиль, сочетающий пиксельную эстетику с современным Material Design 3:

#### Цветовая палитра

**Светлая тема:**
- `LightTurquoise` (#7FD4C1) - Мягкий бирюзовый (primary)
- `LightOrange` (#FFB88C) - Тёплый оранж (secondary)
- `LightPink` (#FFB6D9) - Нежно-розовый (tertiary)
- `LightBackground` (#F5F7FA) - Светлый фон
- `LightText` (#1A1A1A) - Чёрный текст для контраста

**Тёмная тема:**
- `NeonBlue` (#00D4FF) - Неоновый синий (primary)
- `NeonPurple` (#B026FF) - Неоновый фиолетовый (secondary)
- `DarkBackground` (#0F0F1E) - Тёмный фон
- `DarkSurface` (#1E1E2E) - Тёмная поверхность
- `DarkText` (#E0E0E0) - Светлый текст

#### Типографика

- Использование эмодзи как визуальных маркеров
- Чёткие, читаемые шрифты с достаточным контрастом
- Поддержка увеличенного шрифта для доступности

#### Иконка приложения

Иконка выполнена в пиксельном стиле и включает:
- 🏠 Дом (основной элемент) - символ домашнего очага и жизни
- 🐉 Дракончик - питомец игрока
- 🍪 Печенька - секретная механика
- 💰 Монета - игровая валюта

Иконка адаптивна и поддерживает все размеры экранов Android.

### UI Компоненты

#### Карточки локаций
- Раскрывающиеся карточки с описанием
- Плавные анимации при раскрытии
- Кнопка "Начать" для перехода в локацию

#### Навигация
- Material 3 TopAppBar с кнопкой назад
- Jetpack Navigation Compose для навигации между экранами
- Интуитивная структура меню

#### Настройки
- Переключатель темы (светлая/тёмная)
- Информация о приложении
- Сохранение предпочтений в DataStore

## 💻 Архитектура кода

### Clean Architecture

Проект следует принципам Clean Architecture с разделением на слои:

```
┌─────────────────────────────────────┐
│      Presentation Layer             │
│  (UI, ViewModels, Composables)      │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│        Domain Layer                  │
│  (Use Cases, Entities, Interfaces)  │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│         Data Layer                   │
│  (Repositories, Data Sources)       │
└─────────────────────────────────────┘
```

### Структура модулей

```
Life_OS/
├── app/                          # Главный модуль приложения
│   ├── src/main/java/com/life_os/
│   │   ├── data/                 # Data layer
│   │   │   ├── ThemePreferences.kt      # Управление темой через DataStore
│   │   │   └── DataStoreModule.kt       # Модуль DataStore
│   │   ├── ui/                   # Presentation layer
│   │   │   ├── navigation/
│   │   │   │   └── NavGraph.kt          # Граф навигации
│   │   │   ├── screens/
│   │   │   │   ├── home/
│   │   │   │   │   └── HomeScreen.kt    # Главный экран
│   │   │   │   ├── locations/
│   │   │   │   │   └── LocationsMenuScreen.kt  # Меню локаций
│   │   │   │   └── settings/
│   │   │   │       └── SettingsScreen.kt       # Настройки
│   │   │   └── theme/
│   │   │       ├── Color.kt            # Цветовая палитра
│   │   │       ├── Theme.kt            # Тема приложения
│   │   │       └── Type.kt             # Типографика
│   │   └── MainActivity.kt             # Точка входа
│   └── build.gradle.kts
├── core/                         # Общие модули (планируется)
│   ├── domain/                   # Domain layer
│   ├── data/                     # Data layer
│   └── ui/                       # UI компоненты
└── settings.gradle.kts
```

### Ключевые компоненты

#### 1. DataStore для настроек

```kotlin
// DataStoreModule.kt
private val Context.lifeOsDataStore: DataStore<Preferences> 
    by preferencesDataStore(name = "life_os_preferences")

fun getDataStore(context: Context): DataStore<Preferences> 
    = context.lifeOsDataStore
```

**Преимущества:**
- Асинхронное чтение/запись
- Type-safe API
- Автоматическая обработка ошибок

#### 2. Навигация

```kotlin
// NavGraph.kt
sealed class Screen(val route: String) {
    object Home : Screen("home")
    object LocationsMenu : Screen("locations_menu")
    object Settings : Screen("settings")
}
```

**Особенности:**
- Type-safe навигация
- Централизованное управление маршрутами
- Легко расширяемая структура

#### 3. Управление темой

```kotlin
// ThemePreferences.kt
class ThemePreferences(private val dataStore: DataStore<Preferences>) {
    val isDarkTheme: Flow<Boolean> = dataStore.data.map { 
        preferences -> preferences[DARK_THEME_KEY] ?: false 
    }
    
    suspend fun setDarkTheme(isDark: Boolean) {
        dataStore.edit { preferences ->
            preferences[DARK_THEME_KEY] = isDark
        }
    }
}
```

**Реализация:**
- Реактивное обновление UI через Flow
- Сохранение состояния между сессиями
- Интеграция с Material 3 Theme

#### 4. Compose UI

Все экраны построены на Jetpack Compose:

- **Декларативный UI** - описание интерфейса через функции
- **Recomposition** - автоматическое обновление при изменении состояния
- **Material 3** - современный дизайн-система

### Паттерны проектирования

#### MVVM (Model-View-ViewModel)

```
View (Composable) ←→ ViewModel ←→ Repository ←→ DataSource
```

**Преимущества:**
- Разделение ответственности
- Тестируемость
- Реактивное программирование

#### Repository Pattern

```kotlin
interface ThemeRepository {
    fun getTheme(): Flow<Boolean>
    suspend fun setTheme(isDark: Boolean)
}
```

**Цель:**
- Абстракция источника данных
- Единая точка доступа к данным
- Легкая замена реализации

### Зависимости

#### Основные библиотеки

```kotlin
// UI
implementation("androidx.compose.material3:material3")
implementation("androidx.navigation:navigation-compose")
implementation("androidx.compose.material:material-icons-extended")

// Data
implementation("androidx.datastore:datastore-preferences")
implementation("androidx.room:room-runtime")
implementation("androidx.room:room-ktx")

// Coroutines
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android")

// Lifecycle
implementation("androidx.lifecycle:lifecycle-viewmodel-compose")
implementation("androidx.lifecycle:lifecycle-runtime-compose")
```

### Тестирование

#### Unit-тесты
- JUnit 4 для базовых тестов
- MockK для мокирования зависимостей
- Coroutines Test для асинхронного кода

#### UI-тесты
- Espresso Compose для тестирования UI
- Compose Test API для проверки composables

### Best Practices

1. **Kotlin First** - 100% Kotlin код, без Java
2. **Immutable State** - использование `val` и data classes
3. **Coroutines** - для асинхронных операций
4. **Flow** - для реактивных потоков данных
5. **Type Safety** - использование sealed classes и enums
6. **Dependency Injection** - подготовка к внедрению DI (Hilt/Koin)

## 🏗️ Структура проекта

```
Life_OS/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/life_os/
│   │   │   │   ├── data/
│   │   │   │   │   ├── ThemePreferences.kt
│   │   │   │   │   └── DataStoreModule.kt
│   │   │   │   ├── ui/
│   │   │   │   │   ├── navigation/
│   │   │   │   │   │   └── NavGraph.kt
│   │   │   │   │   ├── screens/
│   │   │   │   │   │   ├── home/
│   │   │   │   │   │   ├── locations/
│   │   │   │   │   │   └── settings/
│   │   │   │   │   └── theme/
│   │   │   │   └── MainActivity.kt
│   │   │   └── res/
│   │   │       ├── drawable/
│   │   │       │   ├── ic_lifeos_icon.xml
│   │   │       │   ├── ic_lifeos_icon_adaptive.xml
│   │   │       │   ├── ic_lifeos_icon_background.xml
│   │   │       │   └── ic_lifeos_icon_foreground.xml
│   │   └── test/
├── core/
│   ├── domain/
│   ├── data/
│   └── ui/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 📝 Лицензия

© 2025 Все права защищены

Спасибо, что пользуетесь приложением!

## 🚀 Планы на будущее

- Реализация всех 21 локации
- Интеграция Firebase для онлайн-режима
- Добавление AR-функционала
- Расширение системы достижений
- Мультиплеер режим

## 👨‍💻 Разработка

Проект находится в активной разработке. Приветствуются предложения и pull requests!

---

**Версия**: 1.0.0  
**Дата релиза**: 2025
Made by Viktoriya Gonchar
