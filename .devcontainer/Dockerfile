FROM mcr.microsoft.com/devcontainers/javascript-node:22

# Install Python and uv
RUN apt-get update && apt-get install -y \
 python3 \
 python3-pip \
 python3-venv \
 python3-dev \
 && rm -rf /var/lib/apt/lists/* \
 && python3 -m pip install --break-system-packages --upgrade pip \
 && python3 -m pip install --break-system-packages --user uv

# Ensure pip is available in virtual environments
RUN python3 -m pip install --break-system-packages --upgrade ensurepip

RUN corepack enable pnpm \
 && echo 'alias pnpm="corepack pnpm"' >>/home/node/.bash_aliases \
 && echo 'export PATH="/home/node/.local/bin:$PATH"' >>/home/node/.bashrc \
 && echo 'export PATH="/home/node/.local/bin:$PATH"' >>/home/node/.bash_aliases
