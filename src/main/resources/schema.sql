CREATE TABLE IF NOT EXISTS conversations (
    id SERIAL PRIMARY KEY,
    history_id UUID NOT NULL,
    user_message TEXT NOT NULL,
    assistant_response TEXT NOT NULL,
    timestamp TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE INDEX idx_conversations_history_id ON conversations (history_id);

