package com.life_os.ui.screens.terms

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
fun TermsOfServiceScreen(
    onNavigateBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Заголовок
        TopAppBar(
            title = { Text("📜 Пользовательское соглашение", fontWeight = FontWeight.Bold) },
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
                text = "1. Общие положения",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "1.1. Настоящее Пользовательское соглашение (далее — «Соглашение») регулирует отношения между разработчиком приложения «LifeOS: My Digital Life» (далее — «Разработчик») и пользователем мобильного приложения (далее — «Пользователь»).\n\n" +
                        "1.2. Используя приложение, Пользователь соглашается с условиями настоящего Соглашения. Если Пользователь не согласен с условиями Соглашения, он должен прекратить использование приложения.\n\n" +
                        "1.3. Разработчик оставляет за собой право изменять условия Соглашения в любое время. Изменения вступают в силу с момента публикации новой версии Соглашения в приложении.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "2. Права и обязанности пользователя",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "2.1. Пользователь имеет право:\n" +
                        "• Использовать приложение в личных целях;\n" +
                        "• Получать техническую поддержку;\n" +
                        "• Предлагать улучшения и сообщать об ошибках.\n\n" +
                        "2.2. Пользователь обязуется:\n" +
                        "• Не использовать приложение в незаконных целях;\n" +
                        "• Не пытаться взломать, модифицировать или декомпилировать приложение;\n" +
                        "• Не распространять вредоносное программное обеспечение;\n" +
                        "• Соблюдать все применимые законы и нормативные акты.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "3. Интеллектуальная собственность",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "3.1. Все права на приложение, включая, но не ограничиваясь, кодом, графикой, звуками, текстами и другими материалами, принадлежат Разработчику.\n\n" +
                        "3.2. Пользователь не имеет права копировать, модифицировать, распространять или использовать материалы приложения без письменного разрешения Разработчика.\n\n" +
                        "3.3. Эмодзи и игровые элементы являются частью интеллектуальной собственности приложения.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "4. Ограничение ответственности",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "4.1. Приложение предоставляется «как есть», без каких-либо гарантий.\n\n" +
                        "4.2. Разработчик не несет ответственности за:\n" +
                        "• Потерю данных пользователя;\n" +
                        "• Прерывание работы приложения;\n" +
                        "• Ущерб, причиненный использованием или невозможностью использования приложения.\n\n" +
                        "4.3. Пользователь использует приложение на свой собственный риск.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "5. Игровая валюта и покупки",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "5.1. Игровая валюта (символические единицы) не имеет реальной стоимости и не может быть обменена на реальные деньги.\n\n" +
                        "5.2. Все внутриигровые покупки являются финальными и не подлежат возврату, если иное не предусмотрено законодательством.\n\n" +
                        "5.3. Разработчик оставляет за собой право изменять цены и доступность внутриигровых предметов без предварительного уведомления.",
                style = MaterialTheme.typography.bodyMedium
            )
            
            Text(
                text = "6. Контактная информация",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            
            Text(
                text = "По всем вопросам, связанным с использованием приложения, Пользователь может обратиться к Разработчику через настройки приложения или официальные каналы связи.",
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
