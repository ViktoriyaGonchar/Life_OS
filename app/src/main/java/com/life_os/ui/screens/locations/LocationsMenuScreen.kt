package com.life_os.ui.screens.locations

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Location(
    val id: String,
    val emoji: String,
    val name: String,
    val description: String,
    val fullDescription: String
)

val locations = listOf(
    Location(
        id = "cookie_clicker",
        emoji = "🍪",
        name = "Секретная печенька",
        description = "Кликай по печеньке и зарабатывай деньги",
        fullDescription = "В доме есть невидимая печенька в углу экрана. Кликай по ней → зарабатывай $ даже без работы. Чем больше кликаешь — тем выше пассивный мультипликатор. Стиль: Пиксельная печенька 🍪 с анимацией крошения."
    ),
    Location(
        id = "platformer",
        emoji = "💤",
        name = "Сны персонажа",
        description = "2D платформер в снах",
        fullDescription = "Если персонаж ложится спать, можно войти в его сон. Там — короткий платформер: собери 💤 сны, избегай кошмаров 👹. За прохождение — бонус к настроению 🌈."
    ),
    Location(
        id = "runner",
        emoji = "🏃",
        name = "Бег от налогов",
        description = "Endless Runner в стиле Flappy Bird",
        fullDescription = "Раз в неделю приходит налоговый инспектор. Нажми «Убежать!» → запускается Flappy Bird-стильный раннер: Пролетай между столбами 🏛️, собирай бриллианты 💎. Успех = налоги отменены на неделю."
    ),
    Location(
        id = "rpg",
        emoji = "📖",
        name = "Книга судеб",
        description = "Text-Based Adventure RPG",
        fullDescription = "В библиотеке (часть дома) — интерактивная книга. Выбираешь путь: «Стать рыцарем 🛡️» или «Уйти в море ⚓». Решения влияют на доступные профессии и внешность персонажа."
    ),
    Location(
        id = "match3",
        emoji = "⭐",
        name = "Магическая шкатулка",
        description = "Match-3 Puzzle в стиле Candy Crush",
        fullDescription = "Найди в AR-квесте волшебную шкатулку. Открой → игра в стиле Candy Crush: собери 3 звезды ⭐. Награда: редкий предмет для кастомизации."
    ),
    Location(
        id = "tic_tac_toe",
        emoji = "⭕",
        name = "Игра в парке",
        description = "Онлайн Tic-Tac-Toe с ботом",
        fullDescription = "В локации «Парк» можно сыграть с ботом-пенсионером в крестики-нолики. Победа = + к репутации 👴. (Онлайн-версия — заглушка для будущего.)"
    ),
    Location(
        id = "city_builder",
        emoji = "🏘️",
        name = "Мой район",
        description = "Isometric City Builder",
        fullDescription = "На уровне 10 открывается карта района. Строй дома 🏘️, парки 🌳, магазины 🛒. Жители (боты) ходят по улицам → чем красивее район, тем выше доход 💰."
    ),
    Location(
        id = "fps",
        emoji = "🎯",
        name = "Арена снов",
        description = "3D FPS Arena",
        fullDescription = "В особых снах (после 3 ночей подряд без стресса) — 3D-арена. Упрощённый FPS: стреляй в мишени 🎯 с помощью гироскопа. Использует Sceneform Lite или псевдо-3D через 2D-спрайты."
    ),
    Location(
        id = "dungeon",
        emoji = "🧙",
        name = "Подземелье под домом",
        description = "Open World Quest RPG",
        fullDescription = "Раскрой секретную доску в подвале → попадёшь в процедурно генерируемое подземелье. Квесты от NPC 🧙‍♂️, сундуки 🧰, ловушки ⚠️. Генерация — через алгоритм типа DFS."
    ),
    Location(
        id = "clan_wars",
        emoji = "⚔️",
        name = "Клановые войны",
        description = "Multiplayer Battle Arena",
        fullDescription = "Создай клан → приглашай друзей (или ботов). Раз в день — 60-секундный рейд против другого клана. Синхронизация — через Firebase Realtime Database (заглушка)."
    ),
    Location(
        id = "ar_treasure",
        emoji = "📸",
        name = "Охота за артефактами",
        description = "AR Treasure Hunt",
        fullDescription = "Раз в неделю — AR-режим. Ищи в реальном мире виртуальные артефакты через камеру. После нахождения — мини-квест (например, собрать 3 части карты)."
    ),
    Location(
        id = "pet",
        emoji = "🐉",
        name = "Мой питомец",
        description = "Цифровой террариум",
        fullDescription = "Дракон, кот, робопёс. Уровни счастья, голода, энергии. Локальные уведомления: «🐉 Хочу играть!»"
    ),
    Location(
        id = "farm",
        emoji = "🌾",
        name = "Ферма за домом",
        description = "Idle Farm",
        fullDescription = "Часть замка: сажай пшеницу 🌾, собирай урожай. Пассивный доход даже в фоне. Соседи могут помочь/украсть."
    ),
    Location(
        id = "rhythm",
        emoji = "🎵",
        name = "Музыкальная комната",
        description = "Rhythm Tap",
        fullDescription = "В доме — музыкальный уголок. Загрузи трек или выбери демо → играй под ритм. Использует Visualizer API (заглушка) + тайминг."
    ),
    Location(
        id = "maze",
        emoji = "🧩",
        name = "Лабиринт разума",
        description = "Procedural Maze",
        fullDescription = "Доступен при стрессе >80%. Пройди лабиринт → снизь уровень тревоги. Генерация — каждый раз новая."
    ),
    Location(
        id = "coop",
        emoji = "🤝",
        name = "Дом с друзьями",
        description = "Кооперативная головоломка",
        fullDescription = "При посещении друга — совместная мини-игра: Один открывает дверь 🔓, другой несёт ключ 🗝️. Только в локальном режиме (2 профиля на одном устройстве)."
    ),
    Location(
        id = "demolition",
        emoji = "🧱",
        name = "Реставрация дома",
        description = "Demolition Sandbox",
        fullDescription = "Старый дом можно перестраивать: Сноси стену 🧱 → построй кухню 🍳. Физика разрушения — через простую анимацию (без Box2D)."
    ),
    Location(
        id = "stealth",
        emoji = "🌑",
        name = "Ночной патруль",
        description = "Top-Down Stealth",
        fullDescription = "На уровне «Охранник» — режим скрытности: Избегай лучей фонариков 🔦, Крадись в тени 🌑. Конус обзора — через raycasting (упрощённый)."
    ),
    Location(
        id = "eco_sim",
        emoji = "🌸",
        name = "Сад на балконе",
        description = "Eco Sim",
        fullDescription = "Вырасти растения 🌸, привлеки бабочек 🦋. Погода влияет на рост (дождь = +, засуха = -). Динамическая экосистема в мини-формате."
    ),
    Location(
        id = "merge",
        emoji = "🛋️",
        name = "Украшение комнаты",
        description = "Merge & Build",
        fullDescription = "Слияние предметов: 2 стула 🪑 + 🪑 → диван 🛋️, 2 лампы 💡 → люстра ✨. Визуальная прогрессия — ключ к удержанию."
    ),
    Location(
        id = "life_sim",
        emoji = "🏠",
        name = "Мой день",
        description = "Life Sim: Ядро игры",
        fullDescription = "Основная механика LifeOS — управление виртуальным персонажем в ускоренном 24-часовом цикле. Работа, отдых, уход за питомцем, строительство замка, рыбалка, рейды."
    )
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationsMenuScreen(
    onNavigateBack: () -> Unit
) {
    var expandedLocationId by remember { mutableStateOf<String?>(null) }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Заголовок
        TopAppBar(
            title = { Text("🌍 Меню локаций", fontWeight = FontWeight.Bold) },
            navigationIcon = {
                IconButton(onClick = onNavigateBack) {
                    Text("←", fontSize = 24.sp)
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        )
        
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(locations) { location ->
                LocationCard(
                    location = location,
                    isExpanded = expandedLocationId == location.id,
                    onExpandToggle = {
                        expandedLocationId = if (expandedLocationId == location.id) null else location.id
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationCard(
    location: Location,
    isExpanded: Boolean,
    onExpandToggle: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        onClick = onExpandToggle
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "${location.emoji} ${location.name}",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    imageVector = if (isExpanded) {
                        Icons.Default.ExpandLess
                    } else {
                        Icons.Default.ExpandMore
                    },
                    contentDescription = null
                )
            }
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Text(
                text = location.description,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
            )
            
            if (isExpanded) {
                Spacer(modifier = Modifier.height(12.dp))
                
                Text(
                    text = location.fullDescription,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                )
                
                Spacer(modifier = Modifier.height(12.dp))
                
                Button(
                    onClick = { /* TODO: Navigate to location */ },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary
                    )
                ) {
                    Text("Начать", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
