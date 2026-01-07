FROM mcr.microsoft.com/devcontainers/javascript-node:24

# Install Python and uv
RUN apt-get update && apt-get install -y \
  python3 \
  python3-venv \
  python3-dev \
  && rm -rf /var/lib/apt/lists/*

# Install uv via the official standalone installer (no pip needed)
RUN curl -LsSf https://astral.sh/uv/install.sh | env UV_INSTALL_DIR=/usr/local/bin sh

RUN npm install -g pnpm
