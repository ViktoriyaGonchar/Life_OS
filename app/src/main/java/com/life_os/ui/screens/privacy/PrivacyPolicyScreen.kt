package com.life_os.ui.screens.privacy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrivacyPolicyScreen(
    onNavigateBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Заголовок
        TopAppBar(
            title = { Text("🔒 Политика конфиденциальности", fontWeight = FontWeight.Bold) },
            navigationIcon = {
                IconButton(onClick = onNavigateBack) {
                    Text("←", fontSize = 24.sp)
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        )
        
        // Контент с прокруткой
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Последнее обновление: 1 января 2025 года",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
            )
            
            Divider()
            
            Text(
                text = "1. Общие сведения",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "1.1. Настоящая Политика конфиденциальности описывает, как приложение «LifeOS: My Digital Life» (далее — «Приложение») собирает, использует и защищает персональные данные пользователей.\n\n" +
                        "1.2. Используя Приложение, Пользователь соглашается с условиями настоящей Политики конфиденциальности.\n\n" +
                        "1.3. Разработчик обязуется защищать конфиденциальность Пользователей и соблюдать применимое законодательство о защите персональных данных.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "2. Собираемые данные",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "2.1. Приложение может собирать следующие типы данных:\n\n" +
                        "• Локальные данные игры: прогресс, предметы, настройки (хранятся только на устройстве);\n" +
                        "• Технические данные: версия ОС, модель устройства, версия приложения (для улучшения работы);\n" +
                        "• Данные использования: время игры, предпочтения (анонимно, для аналитики).\n\n" +
                        "2.2. Приложение НЕ собирает:\n" +
                        "• Личные идентификационные данные (имя, email, телефон);\n" +
                        "• Данные местоположения без явного согласия;\n" +
                        "• Контакты и сообщения пользователя;\n" +
                        "• Фотографии и файлы пользователя.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "3. Использование данных",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "3.1. Собранные данные используются для:\n" +
                        "• Обеспечения работы приложения;\n" +
                        "• Улучшения пользовательского опыта;\n" +
                        "• Исправления ошибок и оптимизации производительности;\n" +
                        "• Персонализации игрового опыта.\n\n" +
                        "3.2. Данные НЕ передаются третьим лицам без согласия Пользователя, за исключением случаев, предусмотренных законодательством.\n\n" +
                        "3.3. Анонимные аналитические данные могут использоваться для улучшения приложения.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "4. Хранение данных",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "4.1. Локальные данные игры хранятся на устройстве Пользователя с использованием Android DataStore и Room Database.\n\n" +
                        "4.2. Данные сохраняются локально и не синхронизируются с серверами без явного согласия Пользователя.\n\n" +
                        "4.3. При удалении приложения все локальные данные удаляются вместе с приложением.\n\n" +
                        "4.4. Пользователь может в любой момент очистить данные приложения через настройки устройства.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "5. Права пользователя",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "5.1. Пользователь имеет право:\n" +
                        "• Получить доступ к своим данным;\n" +
                        "• Запросить удаление данных;\n" +
                        "• Отозвать согласие на обработку данных;\n" +
                        "• Ограничить обработку данных.\n\n" +
                        "5.2. Для реализации своих прав Пользователь может обратиться к Разработчику через настройки приложения.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "6. Защита данных",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "6.1. Разработчик принимает разумные меры для защиты данных Пользователя от несанкционированного доступа, изменения, раскрытия или уничтожения.\n\n" +
                        "6.2. Данные хранятся в зашифрованном виде на устройстве Пользователя.\n\n" +
                        "6.3. При использовании онлайн-функций применяются стандартные протоколы шифрования.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "7. Изменения в политике",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "7.1. Разработчик оставляет за собой право изменять настоящую Политику конфиденциальности.\n\n" +
                        "7.2. О существенных изменениях Пользователь будет уведомлен через приложение.\n\n" +
                        "7.3. Продолжение использования приложения после изменений означает согласие с новой версией Политики.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "8. Контактная информация",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "По всем вопросам, связанным с обработкой персональных данных, Пользователь может обратиться к Разработчику через настройки приложения или официальные каналы связи.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Text(
                text = "© 2025 LifeOS: My Digital Life. Все права защищены.",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
        }
    }
}
